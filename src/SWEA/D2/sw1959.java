package SWEA.D2;

import java.util.Scanner;

public class sw1959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int n = sc.nextInt();   //3
            int m = sc.nextInt();   //5
            int num = 0;
            int mul = 0;
            int max = 0;
            int[] aj = new int[n];
            int[] bj = new int[m];


            for (int j = 0; j < n; j++) {
                aj[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                bj[j] = sc.nextInt();
            }

            if (n > m){
                num = n - m + 1;

                for (int j = 0; j < num; j++) {
                    for (int k = 0; k < m; k++) {
                        mul += aj[k + j] * bj[k];
                        System.out.println("k " + k + " / aj = " + aj[k + j] + " / bj = " + bj[k] + " / mul = " + mul);
                    }
                    System.out.println("num = " + j + "mul = " + mul);
                    if (max < mul){
                        max = mul;
                    }
                    mul = 0;
                }
            }
            else if (n < m){
                num = m - n + 1;

                for (int j = 0; j < num; j++) {
                    for (int k = 0; k < n; k++) {
                        mul += aj[k] * bj[k + j];
                        System.out.println("k " + k + " / aj = " + aj[k] + " / bj = " + bj[k + j] + " / mul = " + mul);
                    }
                    System.out.println("num = " + j + "mul = " + mul);
                    if (max < mul){
                        max = mul;
                    }
                    mul = 0;
                }
            }
            System.out.printf("#%d %d\n", i, max);
        }
    }
}