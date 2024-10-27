package SWEA.D3;

import java.util.Scanner;

public class sw22574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            int maxPossibleFloor = n * (n + 1) / 2;

            boolean[] dp = new boolean[maxPossibleFloor +1];
            dp[0] = true;

            int maxFloor = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = maxPossibleFloor; j >= 0; j--) {
                    if (dp[j]) {
                        if (j + i != p && j + i <= maxPossibleFloor) {
                            dp[j + i] = true;
                            maxFloor = Math.max(maxFloor, j + i);
                        }
                    }
                }
            }
            sb.append(maxFloor).append("\n");
        }
        System.out.print(sb.toString());
    }
}
