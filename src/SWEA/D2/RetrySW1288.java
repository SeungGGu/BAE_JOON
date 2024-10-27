package SWEA.D2;

import java.util.Scanner;

public class RetrySW1288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int cnt = 0;
            boolean[] hosuk = new boolean[10];
            int n = sc.nextInt();
            int num = 0;

            while (cnt < 10){
                num += n;
                String string_num = Integer.toString(num);
                for (int j = 0; j < string_num.length(); j++) {
                    int number = Character.getNumericValue(string_num.charAt(j));
                    if (!hosuk[number]){
                        hosuk[number] = true;
                        cnt += 1;
                    }
                }
            }
            System.out.printf("#%d %d\n", i, num);
        }
    }
}
