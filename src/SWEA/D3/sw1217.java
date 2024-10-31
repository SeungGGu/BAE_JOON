package SWEA.D3;

import java.util.Scanner;

public class sw1217 {
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 10;

        for (int i=1; i<=T; i++){
            int x = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            result = n;
            ReturnMethod(n, m, 1);

            System.out.printf("#%d %d\n", x, result);
        }
    }

    static void ReturnMethod(int n, int m, int index){
        if (m != index) {
            result *= n;
            ReturnMethod(n, m, index+1);
        }
    }
}
