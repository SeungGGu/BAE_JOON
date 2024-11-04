package SWEA.D3;

import java.util.Scanner;

public class sw2814 {
    static int MAX_VERTEX = 20;
    static int[][] map = new int[MAX_VERTEX][MAX_VERTEX];
    static boolean[] visit = new boolean[MAX_VERTEX];
    static int vertex;
    static int edge;
    static int maxEdge;

    static void dfs(int v, int depth) {
        maxEdge = Math.max(maxEdge, depth);
        visit[v] = true;
        for (int i = 1; i <= vertex; i++) {
            if (map[v][i] == 1 && !visit[i]) {
                dfs(i, depth + 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            vertex = sc.nextInt();  //3
            edge = sc.nextInt();    //2

            map = new int[MAX_VERTEX][MAX_VERTEX];
            visit = new boolean[MAX_VERTEX];

            for (int i = 0; i < edge; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                map[n][m] = 1;
                map[m][n] = 1;
            }
            maxEdge = 0;
            for (int i = 1; i <= vertex; i++) {
                dfs(i, 1);
                visit = new boolean[MAX_VERTEX];
            }

            System.out.printf("#%d %d\n", test_case, maxEdge);
        }
    }
}
