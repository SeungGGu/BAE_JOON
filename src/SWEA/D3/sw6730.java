package SWEA.D3;

import java.util.Scanner;

public class sw6730 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=1; i<=T; i++){
            int n = sc.nextInt();
            int up = 0;
            int down = 0;
            int[] map = new int[n];

            for (int j = 0; j < n; j++) {
                map[j] = sc.nextInt();
            }

            for (int j = 0; j < n-1; j++) {
                if (map[j] < map[j+1]){
                    if (up <= map[j+1] - map[j]){
                        up = map[j+1] - map[j];
                    }
                } else if (map[j] > map[j+1]){
                    if (down <= map[j] - map[j+1]){
                        down = map[j] - map[j+1];
                    }
                }
            }
            System.out.printf("#%d %d %d\n", i, up, down);
        }
    }
}
