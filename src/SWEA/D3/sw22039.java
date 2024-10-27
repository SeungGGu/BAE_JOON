package SWEA.D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sw22039 {
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
                partitionFibonacci(fibs, halfSum, 0, 0, new boolean[n]);

                if (foundSolution) {
                    System.out.println(result.toString());
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
        if (foundSolution) return; // 이미 해를 찾은 경우 더 이상 탐색하지 않음

        if (currentSum == halfSum) {
            foundSolution = true;
            for (int i = 0; i < fibs.size(); i++) {
                result.setCharAt(i, chosen[i] ? 'B' : 'A');
            }
            return;
        }

        if (index >= fibs.size() || currentSum > halfSum) {
            return; // 종료 조건
        }

        // index 번째 항목을 집합 A에 넣음
        chosen[index] = true;
        partitionFibonacci(fibs, halfSum, currentSum + fibs.get(index), index + 1, chosen);

        // index 번째 항목을 집합 B에 넣음
        chosen[index] = false;
        partitionFibonacci(fibs, halfSum, currentSum, index + 1, chosen);
    }
}
