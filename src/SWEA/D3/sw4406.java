package SWEA.D3;

import java.util.Scanner;

public class sw4406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            String n = sc.next();

            n = n.replaceAll("a", "");
            n = n.replaceAll("e", "");
            n = n.replaceAll("i", "");
            n = n.replaceAll("o", "");
            n = n.replaceAll("u", "");

            System.out.printf("#%d %s\n", i, n);
        }
    }
}
