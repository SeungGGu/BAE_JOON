package SWEA.D2;

import java.util.Scanner;

public class sw1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            String[][] arrResult = new String[N][3];
            String result = "";

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            // 1열
            for (int j = 0; j < N; j++) {
                result = "";
                for (int k = N - 1; k >= 0; k--) {
                    result += arr[k][j];
                }
                arrResult[j][0] = result;
            }

            // 2열
            for (int j = N - 1; j >= 0; j--) {
                result = ""; // 매 회 초기화
                for (int k = N - 1; k >= 0; k--) {
                    result += arr[j][k];
                }
                arrResult[N - 1 - j][1] = result;
            }

            // 3열
            for (int j = N - 1; j >= 0; j--) {
                result = "";
                for (int k = 0; k < N; k++) {
                    result += arr[k][j];
                }
                arrResult[N - 1 - j][2] = result;
            }

            //출력
            System.out.printf("#%d\n", i);
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arrResult[j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}