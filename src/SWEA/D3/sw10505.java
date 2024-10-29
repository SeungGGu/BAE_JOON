package SWEA.D3;

import java.util.Scanner;

public class sw10505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for  (int i=1; i<=T; i++){
            int n = sc.nextInt();
            int cnt = 0;
            int p[] = new int[n];
            int avg = 0;
            for (int j = 0; j < n; j++) {
                p[j] = sc.nextInt();
                avg += p[j];
            }
            avg = avg/n;

            for (int j = 0; j < n; j++) {
                if (avg >= p[j]){
                    cnt++;
                }
            }

            System.out.printf("#%d %d\n", i, cnt);
        }
    }
}
