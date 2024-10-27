package SWEA.D2;

import java.util.Scanner;

public class sw1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int w = sc.nextInt();

            int aSAresult = 0;
            int bSAresult = 0;

            aSAresult = p * w;

            if (r < w){
                bSAresult = q + (w-r)*s;
            }else {
                bSAresult = q;
            }

            if (aSAresult < bSAresult){
                System.out.printf("#%d %d\n", i, aSAresult);
            }else {
                System.out.printf("#%d %d\n", i, bSAresult);
            }
        }
    }
}


/*
입력순서 P Q R S W
A사는 1리터당 P원의 돈을 지불
B사는 기본요금 Q원 월간 사용량이 R리터 이하인 경우 기본 요금만 R리터보다 많다면 1리터당 S원 추가 지불
종민이의 집에서 한 달간 사용하는 수도의 양은 W
 */