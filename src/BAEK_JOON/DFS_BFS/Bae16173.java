package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bae16173 {
    static int n;
    static int[][] map;
    static boolean[][] visit;
    static boolean found = false;

    public static void jump(int x, int y){
        if (x<0 || y<0 || x>=n || y>= n || visit[x][y] || found){
            return;
        }

        if (x == n-1 && y== n-1){
            System.out.println("HaruHaru");
            found = true;
            return;
        }

        visit[x][y] = true;
        int jumpSet = map[x][y];

        jump(x + jumpSet, y);
        jump(x, y + jumpSet);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        jump(0, 0);

        if (!found){
            System.out.println("Hing");
        }
    }
}
