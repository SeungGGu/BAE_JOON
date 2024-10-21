package SwEA.D1;

import java.util.Scanner;

public class sw2043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        while(P>=K){
            K++;
            count++;
        }
        System.out.println(count);
    }
}
