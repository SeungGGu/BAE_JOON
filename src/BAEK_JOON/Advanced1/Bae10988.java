package BAEK_JOON.Advanced1;

import java.io.IOException;
import java.util.Scanner;

public class Bae10988 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        String paul = String.valueOf(sb);
        String reverse = String.valueOf(sb.reverse());
        if (paul.equals(reverse)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
