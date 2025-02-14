package Programmers.Basics;

import java.util.Scanner;

public class Basic2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        String answer = solution(my_string, overwrite_string, s);

        System.out.println(answer);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = "";
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        answer = sb.toString();
        return answer;
    }
}
