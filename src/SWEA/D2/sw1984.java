package SWEA.D2;

import java.util.Scanner;

public class sw1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int[] arr = new int[10];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sumAvg = 0;

            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
                if (max < arr[j]){
                    max = arr[j];
                }
                if (min > arr[j]){
                    min = arr[j];
                }
            }

            for (int a = 0; a < 10; a++) {
                // sort remove 0 9
                sumAvg += arr[a];
            }

            int result = sumAvg-min-max;

            double avg = (double)result / 8;
            int finAvg = (int) Math.round(avg);

            System.out.println("#" + i + " " + finAvg);
        }
    }
}
