package SwEA.D2;

import java.util.Scanner;

public class sw2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
			int count = 0;
            String testcase = sc.next();

            for(int j = 0; j < testcase.length(); j++){
                System.out.print(testcase.charAt(j));
                
            }


            //System.out.println("#" + i + " " + testcase );
        }
    }
}
