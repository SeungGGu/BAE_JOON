package BAEK_JOON.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bae1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        double sum = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }
        System.out.print(sum/arr.length);
    }
}
