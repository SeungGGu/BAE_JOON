package loop;

import java.util.Scanner;

public class Bae11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = 0;
        line = sc.nextInt();

        int a[] = new int[line];
        int b[] = new int[line];
        int[] sum = new int[line];

        for(int i=0; i < line; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum[i] = a[i] + b[i];
        }

        sc.close();

        for(int i=0; i<line; i++){
            System.out.println("Case #" + (i+1) +": " + a[i] + " + " + b[i] + " = " + sum[i]);
        }
    }
}
