package BAEK_JOON.Array;

import java.io.IOException;
import java.util.Scanner;

public class Bae10813 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        int temp = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int j = 0; j < M; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            temp = arr[a - 1];
            arr[a - 1] = arr[b - 1];
            arr[b - 1] = temp;
        }
        for (int k = 0; k < N; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
