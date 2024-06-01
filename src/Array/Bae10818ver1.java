package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bae10818ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //sort 사용법
        Arrays.sort(arr);

        System.out.printf("%d %d", arr[0], arr[arr.length-1]);


    }
}
