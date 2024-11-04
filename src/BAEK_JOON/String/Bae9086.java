package BAEK_JOON.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bae9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int length = str.length()-1;
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(length));
            System.out.println();
        }
    }
}
