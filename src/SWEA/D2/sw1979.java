package SWEA.D2;

import java.util.Scanner;

public class sw1979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++) {
            int N = sc.nextInt();       //5
            int K = sc.nextInt();       //3
            int cnt = 0;
            int result = 0;
            int[][] map = new int[N][N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    map[j][k] = sc.nextInt();
                }
            }

            for (int j = 0; j < N; j++) {       //01234
//                System.out.print(j + "x");
                for (int k = 0; k < N; k++) {   //01234
                    if (map[j][k] == 1) {
                        cnt += 1;
                    } else if (map[j][k] == 0 && cnt == K) {
                        cnt = 0;
                        result += 1;
                    } else {
                        cnt = 0;
                    }

//                    System.out.print(map[j][k]);
                }
//                System.out.println();
                if (cnt == K) {
                    result += 1;
                }
//                System.out.println("x" + j + "cnt" + cnt + "result" + result);
                cnt = 0;
            }

            for (int j = 0; j < N; j++) {       //01234
//                System.out.print(j + "y");
                for (int k = 0; k < N; k++) {   //01234
                    if (map[k][j] == 1) {
                        cnt += 1;
                    } else if (map[k][j] == 0 && cnt == K) {
                        cnt = 0;
                        result += 1;
                    } else {
                        cnt = 0;
                    }

//                    System.out.print(map[k][j]);
                }
//                System.out.println();
                if (cnt == K) {
                    result += 1;
                }
//                System.out.println("x" + j + "cnt" + cnt + "result" + result);
                cnt = 0;
            }

            System.out.println("#" + i + " " + result);
        }
    }
}
