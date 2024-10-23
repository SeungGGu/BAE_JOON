package SwEA.D2;

import java.util.Scanner;

public class sw1970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int N = sc.nextInt();

            int fm = 0;     //50,000 원
            int m = 0;      //10,000 원
            int fth = 0;    //5,000 원
            int th = 0;     //1,000 원
            int fh = 0;     //500 원
            int h = 0;      //100 원
            int fi = 0;     //50 원
            int t = 0;      //10 원

            fm = N/50000;
            m = (N%50000)/10000;
            fth = (N%10000)/5000;
            th = (N%5000)/1000;
            fh = (N%1000)/500;
            h = (N%500)/100;
            fi = (N%100)/50;
            t = (N%50)/10;

            System.out.printf("#%d\n%d %d %d %d %d %d %d %d\n", i, fm, m, fth, th, fh, h, fi, t);
        }
    }
}
