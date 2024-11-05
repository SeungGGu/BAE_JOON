package BAEK_JOON.JustMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bae4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input.trim());
            int number = 1;
            int length = 1;

            while (number % n != 0) {
                number = (number * 10 + 1) % n;
                length++;
            }
            System.out.println(length);
        }
    }
}
