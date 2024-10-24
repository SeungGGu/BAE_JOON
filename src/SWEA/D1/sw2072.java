package SWEA.D1;

import java.util.Scanner;

public class sw2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 1; i <= T; i++){
            int sum = 0;
            int arr[] = new int[10];
            for (int j = 0; j<10; j++){
                arr[j] = sc.nextInt();
                if (arr[j]%2==1){
                    sum += arr[j];
                }
            }
            System.out.println("#" + i +" " + sum);
        }
    }
}
