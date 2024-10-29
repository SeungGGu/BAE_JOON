package SWEA.D3;

import java.util.Scanner;

public class sw3431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            long l = sc.nextInt();
            long u = sc.nextInt();
            long x = sc.nextInt();
            long result;

            if (l <= x && x <= u){
                result = 0;
            } else if (l > x) {
                result = l - x;
            } else {
                result = -1;
            }


            System.out.printf("#%d %d\n", i, result);
        }
    }
}
