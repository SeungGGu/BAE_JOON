package SWEA.D3;

import java.util.Scanner;

public class sw1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            String n = sc.next();
            StringBuilder result = new StringBuilder("");
            int cnt = 0;

            for (int j = 0; j < n.length(); j++) {
                result.append("0");
            }

            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(j) != result.charAt(j)) {   //0011 , 0000
                    for (int k = j; k < n.length(); k++) {
                        result.setCharAt(k, n.charAt(j));
                    }
                    cnt++;
                }
            }

            System.out.printf("#%d %d\n", i, cnt);
        }
    }
}
