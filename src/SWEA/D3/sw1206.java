package SWEA.D3;

import java.util.Scanner;

public class sw1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();   //10
            int[] arr = new int[n];
            int result = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 2; i <= n-2; i++) {    //2 3 4 5 6 7 8
                if(arr[i] > arr[i-2] && arr[i] > arr[i-1]
                        && arr[i] > arr[i+1] && arr[i] > arr[i+2]){
                    int maxNum = 0;
                    if (maxNum < arr[i-2]){
                        maxNum = arr[i-2];
                    }
                    if (maxNum < arr[i-1]){
                        maxNum = arr[i-1];
                    }
                    if (maxNum < arr[i+2]){
                        maxNum = arr[i+2];
                    }
                    if (maxNum < arr[i+1]){
                        maxNum = arr[i+1];
                    }
                    result+= arr[i] - maxNum;
                }
            }

            System.out.printf("#%d %d\n", test_case, result);
        }
    }
}
