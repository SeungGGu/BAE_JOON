package BAEK_JOON.Implement;

import java.util.Scanner;

public class Bae2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long result =a * b * c;
        String st = String.valueOf(result);

        for (int i = 0; i <= 9; i++) {
            String temp = st.replaceAll(String.valueOf(i),"");
            int cnt = st.length() - temp.length();
            System.out.println(cnt);
        }
    }
}
