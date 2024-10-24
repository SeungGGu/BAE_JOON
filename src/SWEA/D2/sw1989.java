package SWEA.D2;

import java.util.Scanner;

public class sw1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            String strN = sc.next();
            int len = strN.length();
            String a;
            String b;
            if(len%2==0){
                a = strN.substring(0, (len/2));
                b = strN.substring((len/2), len);
            }else{
                a = strN.substring(0, (len/2));
                b = strN.substring((len/2)+1, len);
            }
            StringBuffer sbB = new StringBuffer(b);
            String reverseB = sbB.reverse().toString();

            System.out.println(len);
            System.out.println(a);
            System.out.println(b);
            System.out.println(reverseB);

            if (a.equals(reverseB)){
                System.out.println("#" + i + " 1");
            }else {
                System.out.println("#" + i + " 0");
            }
        }
    }
}
