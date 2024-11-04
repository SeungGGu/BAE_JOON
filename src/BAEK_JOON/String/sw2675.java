package BAEK_JOON.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sw2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            String str = input[1];
            StringBuffer sb = new StringBuffer();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < n; k++) {
                    sb.append(str.charAt(j));
                }
            }
            System.out.println(sb);
        }
    }
}
