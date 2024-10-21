package SwEA.D2;

import java.util.Scanner;

public class sw21425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;

            while (a <= n && b <=n){
                if (a < b){
                    a +=b;
                }else{
                    b +=a;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
