package BAEK_JOON.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sw27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.print(a*b);
    }
}
