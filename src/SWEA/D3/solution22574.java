package SWEA.D3;

import java.util.Scanner;

public class solution22574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();  // 선택 횟수 N
            int p = sc.nextInt();  // 폭탄이 설치된 층 P

            System.out.println("테스트 케이스 " + (t + 1) + ": N = " + n + ", P = " + p);

            int maxPossibleFloor = n * (n + 1) / 2;
            System.out.println("가능한 최대 층수: " + maxPossibleFloor);

            boolean[] dp = new boolean[maxPossibleFloor + 1];
            dp[0] = true;
            System.out.println("초기 상태: dp[0] = true");

            int maxFloor = 0;

            // N번의 선택을 반복
            for (int i = 1; i <= n; i++) {
                System.out.println(i + "번째 선택 시작 (이동 가능 층수: +" + i + ")");
                for (int j = maxPossibleFloor; j >= 0; j--) {
                    if (dp[j]) {
                        if (j + i != p && j + i <= maxPossibleFloor) {
                            dp[j + i] = true;
                            maxFloor = Math.max(maxFloor, j + i);
                            System.out.println("    " + j + "층에서 " + (j + i) + "층으로 이동 가능 (현재 최대 층수: " + maxFloor + ")");
                        } else if (j + i == p) {
                            System.out.println("    " + (j + i) + "층은 폭탄 층이므로 이동하지 않음");
                        }
                    }
                }
            }
            System.out.println("테스트 케이스 " + (t + 1) + " 결과: 최대 도달 층수는 " + maxFloor);
            sb.append(maxFloor).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
