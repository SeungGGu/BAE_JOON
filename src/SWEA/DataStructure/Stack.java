package SWEA.DataStructure;

import java.util.Scanner;

public class Stack {
    static final int Max_N = 100;

    static int top;
    static int stack[] = new int[Max_N];

    static void stackInit(){
        top = 0;
    }

    static boolean stackIsEmpty(){
        return (top == 0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int n = sc.nextInt();

            System.out.printf("#%d \n", i);
        }
    }
}
