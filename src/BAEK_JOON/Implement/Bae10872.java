package BAEK_JOON.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bae10872 {
    static int n;

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));
    }
}
