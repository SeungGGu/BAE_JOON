package BAEK_JOON.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bae2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());

        String[] result = String.valueOf(sb.reverse()).split(" ");

        if (Integer.parseInt(result[0]) > Integer.parseInt(result[1])){
            System.out.print(result[0]);
        }else{
            System.out.print(result[1]);
        }
    }
}
