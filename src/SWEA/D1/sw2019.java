package SWEA.D1;

import java.util.Scanner;

public class sw2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int mul = 1;
        for (int i=0; i<=T; i++){
            System.out.print(mul + " " );
            mul =mul * 2;
        }
    }
}
