package SWEA.D3;

import java.util.Scanner;

public class sw10570 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cnt = 0;
            int sqrtN;

            for (int j = a; j <= b; j++) {
                sqrtN = (int)Math.sqrt(j);
                StringBuilder strNum = new StringBuilder(String.valueOf(j));
                StringBuilder strSqrtN = new StringBuilder(String.valueOf(sqrtN));
                String reverseStrNum = strNum.reverse().toString();
                String reverseStr = strSqrtN.reverse().toString();

                if ((sqrtN*sqrtN) == j){
                    if (reverseStr.equals(String.valueOf(sqrtN)) && reverseStrNum.equals(String.valueOf(j))){
                    cnt++;
                    }
                }
            }

            System.out.printf("#%d %d\n", i, cnt);
        }
    }
}
