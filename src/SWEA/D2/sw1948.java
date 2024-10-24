package SWEA.D2;

import java.util.Scanner;

public class sw1948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int[] calender = {31, 28 , 31, 30, 31, 30 ,31 ,31 ,30 ,31, 30 ,31};
            int nMonth = sc.nextInt();
            int nDay = sc.nextInt();
            int mMonth = sc.nextInt();
            int mDay = sc.nextInt();
            int result = 0;

            for (int j = nMonth; j < mMonth; j++) {
                result += calender[j-1];
                System.out.println("j = " + j + " / result = " + result);
            }
            result = result - nDay + mDay +1;
            System.out.println("result = " + result + " / nDay = " + nDay + " / mDay = " + mDay);
            System.out.printf("#%d %d\n", i, result);
        }
    }
}
