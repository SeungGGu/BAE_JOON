package SWEA.D3;

import java.util.Scanner;

public class sw22574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();  // 선택 횟수 N
            int p = sc.nextInt();  // 폭탄이 설치된 층 P
            int floor = 0;

            for (int i = 1; i <= n; i++) {
                int temp = floor + i;
                if (temp != p){
                    floor += i;
                }else{
                    floor += i-1;
                }
            }
            System.out.println(floor);
        }
        sc.close();
    }
}
