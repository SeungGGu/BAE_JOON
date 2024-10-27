package SWEA.D2;

import java.util.Scanner;

public class sw1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            int speed = 0;
            int distance = 0;

            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();

                if (x != 0) {
                    int how = sc.nextInt();

                    if (x == 1) {
                        speed += how;
                    } else if (x == 2) {
                        speed -= how;
                        if (speed < 0) {
                            speed = 0;
                        }
                    }
                }
                distance += speed;  //2 1
            }
            System.out.printf("#%d %d\n", i, distance);
        }
    }
}
