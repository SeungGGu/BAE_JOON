package SWEA.D3;

import java.util.Scanner;

public class sw7728 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int n = sc.nextInt();
            int cnt = 0;

            String strN = String.valueOf(n);

            while (!strN.isEmpty()){
                strN = strN.replaceAll(String.valueOf(strN.charAt(0)),"");
                cnt++;
            }

            System.out.printf("#%d %d\n", i, cnt);
        }
    }
}
