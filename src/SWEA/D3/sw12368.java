package SWEA.D3;

import java.util.Scanner;

public class sw12368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int f = sc.nextInt();
            int l = sc.nextInt();
            int result;

            result = f + l;

            if (result == 24){
                result = 0;
            }else if (result > 24){
                result -= 24;
            }

            System.out.printf("#%d %d\n", i, result);
        }
    }
}
