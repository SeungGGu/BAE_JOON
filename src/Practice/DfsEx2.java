package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class DfsEx2 {
    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int max = Integer.MIN_VALUE;
    static int[][] pos = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    static int area;
    static int count;

    public static void dfs(int x, int y){
        if (x < 0 || x >= n || y < 0 || y >= n || visited[x][y] || grid[x][y] == 0){
            return;
        }
        visited[x][y] = true;
        count++;
        for (int i = 0; i < pos.length; i++) {
            dfs(x + pos[i][0], y + pos[i][1]);
            max = Math.max(max, count);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];
        visited = new boolean[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]){
                    area++;
                    count = 0;
                    dfs(i,j);
                }
            }
        }
        System.out.println(max);
    }
}
/*
5
0 1 1 0 0
1 1 0 0 1
0 0 0 1 1
1 0 1 1 0
0 0 0 0 1
 */