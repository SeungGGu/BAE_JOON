package BAEK_JOON.Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bae2775 {
    static int t, k, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
        }

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.toString());
    }
}