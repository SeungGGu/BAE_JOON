package SWEA.D1;

import java.util.Arrays;
import java.util.Scanner;

public class sw2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            Integer[] arr = new Integer[10];

            for (int j=0; j<10; j++){
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr, (a,b) ->
                    b - a
            );

            System.out.println("#" + i + " " + arr[0]);
        }
    }
}
