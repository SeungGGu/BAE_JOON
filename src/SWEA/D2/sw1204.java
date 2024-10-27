package SWEA.D2;

import java.util.Scanner;

public class sw1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            int[][] score = new int[2][101]; // 카운트 횟수 / 점수

            for (int k = 0; k <= 100; k++) {
                score[1][k] = k;
            }

            for (int j = 0; j < 1000; j++) {
                int sn = sc.nextInt();
                score[0][sn] += 1;
            }

            int maxCount = 0;
            int maxScore = 0;
            for (int j = 0; j <= 100; j++) {
                if (score[0][j] > maxCount) {
                    maxCount = score[0][j];
                    maxScore = score[1][j];
                } else if (score[0][j] == maxCount) {
                    if (score[1][j] > maxScore) {
                        maxScore = score[1][j];
                    }
                }
            }

            System.out.println("#" + i + " " + maxScore);
        }
    }
}
