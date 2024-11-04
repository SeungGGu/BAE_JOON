package SWEA.D3;

import java.util.Scanner;

import java.util.HashSet;

public class sw1244 {
    static int max;
    static int[] digits;
    static int swapCount;
    static HashSet<String> visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            String num = sc.next();
            swapCount = sc.nextInt();
            digits = new int[num.length()];
            max = 0;
            visited = new HashSet<>();

            // 숫자판을 각 자리수 배열로 변환
            for (int i = 0; i < num.length(); i++) {
                digits[i] = num.charAt(i) - '0';
            }

            System.out.println("== Test Case #" + t + " =="); // 테스트 케이스 시작 로그
            dfs(0);

            System.out.println("최종 최댓값: " + max);
            System.out.println("#" + t + " " + max);
        }
        sc.close();
    }

    // DFS를 이용하여 교환하며 최댓값 찾기
    static void dfs(int depth) {
        // 교환 횟수에 도달하면 현재 숫자로 최댓값 갱신
        if (depth == swapCount) {
            int currentValue = toNumber(digits);
            System.out.println("교환 횟수 도달, 현재 숫자: " + currentValue);
            max = Math.max(max, currentValue);
            System.out.println("갱신된 최댓값: " + max);
            return;
        }

        // 현재 상태 문자열로 저장하여 방문 여부 확인
        String currentState = toString(digits) + depth;
        if (visited.contains(currentState)) {
            System.out.println("이미 방문한 상태, 스킵: " + currentState);
            return;
        }
        visited.add(currentState);

        // 숫자판의 각 자리수를 서로 교환
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                System.out.println("교환 전: " + toString(digits) + ", 교환 위치: (" + i + ", " + j + ")");
                swap(i, j);
                System.out.println("교환 후: " + toString(digits));

                dfs(depth + 1); // 다음 교환으로 이동

                swap(i, j); // 원상태로 되돌리기
                System.out.println("원상복구 후: " + toString(digits));
            }
        }
    }

    // 배열을 정수형으로 변환
    static int toNumber(int[] digits) {
        int num = 0;
        for (int digit : digits) {
            num = num * 10 + digit;
        }
        return num;
    }

    // 배열을 문자열로 변환
    static String toString(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        return sb.toString();
    }

    // 두 자리의 숫자판을 교환
    static void swap(int i, int j) {
        int temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
}
