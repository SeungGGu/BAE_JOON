package SWEA.D3;

import java.util.Scanner;

public class sw21131 {
    static int index;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            long[][] arr = new long[n][n];

            for (int j = 0; j < n; j++) {       // 0 1 2 3
                for (int k = 0; k < n; k++) {   // 0 1 2 3      i * n + j + 1
                    arr[k][j] = sc.nextInt();
                }
            }


            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("j = " + j + " / k = " + k + " / arr = " + arr[j][k]);
                }
            }


            System.out.printf("#%d \n", i);
        }
    }


    static long memoization(int n){
        return n;
    }
}

/*
4 * 4 행렬인 A가 있다
각 원소는 1이상 16이하의 자연수로 모두 서로 다르다
A[i,j] 표기한다
1 < = i,j = < = N 에 대해 A[i,j]=(i-1) x N + j가 성립한다
8 = A[4,1] = (4-1) * 4 + 1;
정렬하기 위해 최소 몇 회 사용해야하는지 구하자

1
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
 */
