package BAEK_JOON.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bae27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());
        String result = "";
        result = String.valueOf(str.charAt(i-1));
        System.out.println(result);
    }
}
