package Array;

import java.util.Scanner;

public class Bae5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            arr[num - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (arr[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
