package BAEK_JOON.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bae2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String croatia : croatiaAlphabets) {
            input = input.replace(croatia, "*");
        }

        System.out.println(input.length());
    }
}
