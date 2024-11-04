package SWEA.D3;

import java.util.Scanner;

public class sw1240 {
    static int sum;
    static long length;
    static StringBuilder sb;

    public static void secreteCode(long[][] arr, int count, int n, int m){
        for (int i = n; i >= 0; i--) {
            for (int j = m; j >= m; j--) {
                if(arr[i][j] == 1){
                    while(count != 0){
                        sb.append(arr[i][j-count]);
                        count--;
                    }
                }
                System.out.println(sb);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[][] arr = new long[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            secreteCode(arr, 7, n , m);

        }
    }
}
