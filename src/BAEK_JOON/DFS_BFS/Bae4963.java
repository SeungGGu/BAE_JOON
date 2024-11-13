package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bae4963 {
    static int w, h;
    static int[][] grid;
    static boolean[][] visited;
    static int count;
    static int[][] pos = {{0,1}, {0,-1}, {1,0}, {-1,0}, {1,1}, {1,-1},{-1,1},{-1,-1}};

    public static void dfs(int x, int y){
        visited[x][y] = true;

        for (int i = 0; i < pos.length; i++) {
            int nx = x + pos[i][0];
            int ny = y + pos[i][1];
            if (nx >= 0 && nx < h && ny >= 0 && ny < w && grid[nx][ny] == 1 && !visited[nx][ny]){
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;

            grid = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    grid[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (grid[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
