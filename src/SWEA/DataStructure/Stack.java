package SWEA.DataStructure;

import java.util.Scanner;

public class Stack {
    static final int MAX_N = 100;

    static int top;
    static int stack[] = new int[MAX_N];

    static void stackInit() {
        top = 0;
    }

    static boolean stackIsEmpty() {
        return (top == 0);
    }

    static boolean stackIsFull() {
        return (top == MAX_N);
    }

    static boolean stackPush(int value) {
        if (stackIsFull()) {
            System.out.println("stack overflow!");
            return false;
        }
        stack[top] = value;
        top++;

        return true;
    }

    static Integer stackPop() {
        if (top == 0) {
            System.out.println("stack is empty!");
            return null;
        }

        top--;
        Integer value = Integer.valueOf(stack[top]);

        return value;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();

            stackInit();
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();
                stackPush(value);
            }

            System.out.print("#" + i + " ");

            while (!stackIsEmpty()) {
                Integer value = stackPop();
                if (value != null) {
                    System.out.print(value.intValue() + " ");
                }
            }
            System.out.println();
        }
    }
}
