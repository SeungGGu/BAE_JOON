package Programmers.introduction;

import java.util.Scanner;

public class introd1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = solution(n1,n2);

        System.out.println(result);
    }

    public static int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}
