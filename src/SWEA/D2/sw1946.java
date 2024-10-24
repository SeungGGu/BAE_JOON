package SWEA.D2;

import java.util.Arrays;
import java.util.Scanner;

public class sw1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int n = sc.nextInt();
            int cnt = 0;
            String temp = "";
            String[] result = new String[n];

            for (int j = 0; j < n; j++) {
                String aptLine = sc.next();
                int aptcount = sc.nextInt();
                for (int k = 0; k < aptcount; k++) {
                    temp += aptLine;
                    cnt++;
                    if (cnt == 10){
                        temp += " ";
                        cnt = 0;
                    }
                }
            }

            result = (temp.split(" "));

            System.out.printf("#%d\n", i);

            for (int j = 0; j < result.length; j++) {
                System.out.println(result[j]);
            }
        }
    }
}
