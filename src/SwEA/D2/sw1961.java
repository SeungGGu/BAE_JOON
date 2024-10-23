package SwEA.D2;

import java.util.Scanner;

public class sw1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    arr[j][k] =sc.nextInt();
                }
            }


            System.out.printf("#%d \n", i);
        }
    }
}
