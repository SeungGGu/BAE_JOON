package SWEA.D2;

import java.util.Scanner;

public class sw1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int max = 0;
            long salePrice = 0;

            for (int j=0; j<N; j++){
                arr[j] = sc.nextInt();
            }

            for (int h = N-1; h>=0; h--){
                if (max < arr[h]){
                    max = arr[h];
                } else {
                    salePrice += max - arr[h];
                }
            }
            System.out.println("#" + i + " " + salePrice);
        }
    }
}