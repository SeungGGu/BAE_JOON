package SWEA.D2;

import java.util.Scanner;

public class sw1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int N = sc.nextInt();
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                if (j%2 == 1){
                    sum += j;
                }else if(j%2==0){
                    sum -= j;
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
