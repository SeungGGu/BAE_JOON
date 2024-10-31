package SWEA.D3;

import java.util.Scanner;

public class sw9317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            int result = 0;
            for (int j = 0; j < n; j++) {
                if (a.charAt(j) == b.charAt(j)){
                    result++;
                }
            }
            System.out.printf("#%d %d\n", i, result);
        }
    }
}
