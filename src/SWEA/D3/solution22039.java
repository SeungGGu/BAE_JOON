package SWEA.D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution22039 {
    static StringBuilder result;
    static boolean foundSolution;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            result = new StringBuilder();
            foundSolution = false;

            List<Integer> fibs = new ArrayList<>();
            int sum = 0;

            // 피보나치 수열을 배열에 저장하고 합을 구함
            for (int j = 1; j <= n; j++) {
                int fib = fibunachi(j);
                fibs.add(fib);
                sum += fib;
            }

            if (sum % 2 != 0) {
                System.out.println("impossible");
            } else {
                int halfSum = sum / 2;
                result.setLength(n); // 초기 문자열 크기 설정
                System.out.println("==== 새로운 테스트 케이스 ====");
                System.out.println("피보나치 리스트: " + fibs);
                System.out.println("목표 합 (halfSum): " + halfSum);
                partitionFibonacci(fibs, halfSum, 0, 0, new boolean[n]);

                if (foundSolution) {
                    System.out.println("결과: " + result.toString());
                } else {
                    System.out.println("impossible");
                }
            }
        }
    }

    static int fibunachi(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        int a = 1, b = 1, c = 0;
        for (int j = 3; j <= i; j++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    static void partitionFibonacci(List<Integer> fibs, int halfSum, int currentSum, int index, boolean[] chosen) {
        // 로그를 출력하여 재귀 호출 시 상태를 확인
        System.out.println("호출됨: 현재 합 = " + currentSum + ", 인덱스 = " + index + ", 선택된 집합 = " + booleanArrayToString(chosen));

        if (foundSolution) return; // 이미 해를 찾은 경우 더 이상 탐색하지 않음

        if (currentSum == halfSum) {
            foundSolution = true;
            for (int i = 0; i < fibs.size(); i++) {
                result.setCharAt(i, chosen[i] ? 'B' : 'A');
            }
            System.out.println("해답 찾음! 선택된 집합 상태: " + booleanArrayToString(chosen));
            return;
        }

        if (index >= fibs.size() || currentSum > halfSum) {
            System.out.println("백트래킹: 현재 합 = " + currentSum + ", 인덱스 = " + index);
            return; // 종료 조건
        }

        // index 번째 항목을 집합 A에 넣음
        chosen[index] = true;
        partitionFibonacci(fibs, halfSum, currentSum + fibs.get(index), index + 1, chosen);

        // index 번째 항목을 집합 B에 넣음
        chosen[index] = false;
        partitionFibonacci(fibs, halfSum, currentSum, index + 1, chosen);
    }

    // 배열의 내용을 문자열로 변환하여 보여주는 헬퍼 메서드
    static String booleanArrayToString(boolean[] arr) {
        StringBuilder sb = new StringBuilder();
        for (boolean b : arr) {
            sb.append(b ? "B" : "A");
        }
        return sb.toString();
    }
}
