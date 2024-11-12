package BAEK_JOON.Implement;

import java.util.Scanner;

public class Bae1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int result = n;
        while (true){
            cnt++;
            int a = n/10;
            int b = n%10;
            n = (b*10) + ((a + b)%10);
            if (n == result){
                break;
            }
        }
        System.out.println(cnt);
    }
}
