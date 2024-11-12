package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bae7562 {
    static int t, l;
    static int[][] map;
    static int count = 0;

    public static void bfs(int[][] map, int startX, int startY, int endX, int endY){

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < t; test_case++) {
            l = Integer.parseInt(br.readLine());
            map = new int[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            bfs(map ,startX, startY, endX, endY);
        }
    }
}
