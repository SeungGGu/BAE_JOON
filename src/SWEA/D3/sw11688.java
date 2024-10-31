package SWEA.D3;

import java.util.Scanner;

public class sw11688 {
    static int a = 1;
    static int b = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            a = 1;
            b = 1;
            String n = sc.next();
            Calkin(n, 0);

            System.out.printf("#%d %d %d\n", i, a, b);
        }
    }

    static void Calkin(String n, int index){
        if (n.length()==index){
            return;
        }
        String temp = String.valueOf(n.charAt(index));
        if (temp.equals("L")){
            b = a + b;
            Calkin(n, index+1);
        } else if (temp.equals("R")) {
            a = a+ b;
            Calkin(n, index+1);
        }
    }
}
