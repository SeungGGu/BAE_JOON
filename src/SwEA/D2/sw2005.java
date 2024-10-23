package SwEA.D2;

import java.util.Scanner;

public class sw2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for (int a = 0; a < N; a++){
                for (int b=0; b<=a; b++){
                    if (a==b){
                        arr[a][b] = 1;
                    }else if (b==0){
                        arr[a][b] = 1;
                    }else {
                        arr[a][b] = arr[a - 1][b - 1] + arr[a - 1][b];
                    }
                }
            }
            System.out.println("#" + i);
            for (int x = 0; x < N; x++) {
                for (int y = 0; y <= x; y++)
                    System.out.print(arr[x][y] + " ");
                System.out.println();
            }
        }
    }
}