package SWEA.D1;

import java.util.Scanner;

public class sw2050 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String apb = sc.next();

        for(int i=0; i < apb.length(); i++){
            System.out.print(((int)apb.charAt(i)-64) + " ");
        }
    }
}
