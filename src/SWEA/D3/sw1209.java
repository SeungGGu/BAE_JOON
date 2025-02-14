package SWEA.D3;

import java.util.Scanner;

public class sw1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 10;

        for (int test_case = 1; test_case <= t; test_case++) {
            sc.nextInt();
            int max = Integer.MIN_VALUE;
            int[][] grid = new int[100][100];

            int sumCrossA = 0;
            int sumCrossB = 0;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 100; i++) {
                int sumX = 0;
                int sumY = 0;
                for (int j = 0; j < 100; j++) {
                    sumX += grid[i][j];
                    sumY += grid[j][i];
                }
                max = Math.max(max, sumX);
                max = Math.max(max, sumY);
            }

            for (int i = 0; i < 100; i++) {
                sumCrossA += grid[i][i];
                sumCrossB += grid[i][99 - i];
            }
            max = Math.max(max, sumCrossA);
            max = Math.max(max, sumCrossB);

            System.out.printf("#%d %d\n", test_case, max);
        }
    }
}

