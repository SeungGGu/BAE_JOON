package SWEA.D2;

import java.util.Scanner;

public class sw1976 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int num = 4;
            int[] input = new int[num];
            int time = 0;
            int minute = 0;
            for (int j = 0; j <num; j++) {
                input[j] = sc.nextInt();
            }
            time = input[0] + input[2];
            minute = input[1] + input[3];

            if (minute > 60){
                time += 1;
                minute -= 60;
            }
            if (time > 12){
                time -= 12;
            }
            System.out.printf("#%d %d %d\n", i, time, minute);
        }
    }
}
