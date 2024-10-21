package SwEA.D1;

import java.util.Scanner;

public class sw2056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String a = sc.next();

            String strD = a.substring(6, 8);
            String strM = a.substring(4, 6);
            String strY = a.substring(0, 4);

            int inM = Integer.parseInt(strM);
            int inD = Integer.parseInt(strD);

            if(12>= inM && inM > 0){
                switch(inM){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if(31 >= inD && inD > 0){
                            System.out.println("#" + test_case + " " + strY + "/" + strM + "/" + strD);
                        } else{
                            System.out.println("#" + test_case + " " + "-1" );
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if(30 >= inD && inD > 0){
                            System.out.println("#" + test_case + " " + strY + "/" + strM + "/" + strD);
                        } else{
                            System.out.println("#" + test_case + " " + "-1" );
                        }
                        break;
                    default:
                        if(28 >= inD && inD > 0){
                            System.out.println("#" + test_case + " " + strY + "/" + strM + "/" + strD);
                        } else{
                            System.out.println("#" + test_case + " " + "-1" );
                        }
                }
            }else{
                System.out.println("#" + test_case + " " + "-1" );
            }
        }
    }
}