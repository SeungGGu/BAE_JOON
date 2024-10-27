package SWEA.D2;

import java.util.Scanner;

public class sw1945 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i=1; i<=T; i++){
        int num = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        while(num%2 == 0){
            a += 1;
            num = num/2;
        }

        while(num%3 == 0){
            b += 1;
            num = num/3;
        }

        while(num%5 == 0){
            c += 1;
            num = num/5;
        }

        while(num%7 == 0){
            d += 1;
            num = num/7;
        }

        while(num%11 == 0){
            e += 1;
            num = num/11;
        }

        System.out.printf("#%d %d %d %d %d %d\n", i, a, b, c, d, e);
    }
}
}
