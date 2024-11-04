package BAEK_JOON.Array;

import java.util.Scanner;

public class Bae10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        int temp = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            while (a<b){
                temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
                a++;
                b--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
