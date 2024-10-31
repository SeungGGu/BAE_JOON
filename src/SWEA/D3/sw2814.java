package SWEA.D3;

import java.util.Scanner;

public class sw2814 {

    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            largeLongLine(n, m,0);

            System.out.printf("#%d \n", i);
        }
    }

    static void largeLongLine(int n, int m, int index){

        if (index>n){
            return;
        }

    }
}

/*
2

1 0

3 2

1 2
3 2
 */
