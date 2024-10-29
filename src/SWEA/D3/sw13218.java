package SWEA.D3;

import java.util.Scanner;

public class sw13218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int n = sc.nextInt();
            int result;
            result = n/3;

            System.out.printf("#%d %d\n", i, result);
        }
    }
}
