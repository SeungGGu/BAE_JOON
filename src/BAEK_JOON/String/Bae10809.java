package BAEK_JOON.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bae10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] apb = new String[26];

        for (int i = 0; i < 26; i++) {
            apb[i] = "-1";
        }
        for (int i = 0; i < str.length(); i++) {
            int temp = (int)str.charAt(i) - 97;
            if(apb[temp].equals("-1")){
                apb[temp] = String.valueOf(i);
            }
        }

        for (int i = 0; i < apb.length; i++) {
            System.out.print(apb[i] + " ");
        }
    }
}
