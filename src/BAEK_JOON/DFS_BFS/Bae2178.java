package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bae2178 {
    static int n, m;
    static int[][] grid;
    static boolean[][] visited;
    static int[][] pos = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static int bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int nowX = arr[0];
            int nowY = arr[1];

            if (nowX == n-1 && nowY == m-1){
                return grid[nowX][nowY];
            }

            for (int[] pos : pos) {
                int nx = nowX + pos[0];
                int ny = nowY + pos[1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && grid[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    grid[nx][ny] = grid[nowX][nowY] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0,0));
    }
}
