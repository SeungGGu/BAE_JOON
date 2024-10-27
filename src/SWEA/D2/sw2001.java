package SWEA.D2;

import java.util.Scanner;

public class sw2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();       //5
            int M = sc.nextInt();       //2
            int max = 0;
            int cnt = 0;

            int[][] arr = new int[N][N];

            for (int a = 0; a < N; a++) {
                // a = 0 1 2 3 4
                for (int b = 0; b < N; b++) {
                    // b = 0 1 2 3 4
                    arr[a][b] = sc.nextInt();
                }
            }

            for (int x = 0; x <= N-M; x++) {
                //x = 0 1 2 3
                for(int y = 0; y <= N-M; y++){
                    // 0 1 2 3
                    for (int sx = x; sx < x+M; sx++) {
                        // sx = 0
                        // sx = 0 1
                        for (int sy = y; sy < y + M; sy++) {
//                            System.out.print(" sx = " + sx + " sy = " + sy);
                            //sy = 0
                            //sy = 0 1
                            cnt += arr[sx][sy];
                        }
                    }
                    System.out.println("count = "+ cnt);
                    System.out.println();
                    if (max < cnt){
                        max = cnt;
                    }
                    cnt = 0;
                }
            }


            System.out.println("#" + i + " " + max);
        }
    }
}
