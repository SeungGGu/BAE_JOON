package BAEK_JOON.Loop;

import java.util.Scanner;

public class Bae10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;

        while (sc.hasNextInt()){
            A = sc.nextInt();
            B = sc.nextInt();

            System.out.println(A + B);
        }
    }
}