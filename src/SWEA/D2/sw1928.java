package SWEA.D2;

import java.util.Base64;
import java.util.Scanner;

public class sw1928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            String str = sc.next();
            String result = new String(Base64.getDecoder().decode(str));

            System.out.printf("#%d %s\n", i, result);
        }
    }
}