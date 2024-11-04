package SWEA.D3;

import java.util.Scanner;

public class sw1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[] arr = new int[100];
            int max = 0;
            int min = 0;
            int cntMax = 0;
            int cntMin = 0;

            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        cntMax = j;
                    }
                    if (arr[j] < min) {
                        min = arr[j];
                        cntMin = j;
                    }
                }
                arr[cntMax] -= 1;
                arr[cntMin] += 1;
            }
            System.out.printf("#%d %d\n", test_case, max-min);
        }
    }
}
