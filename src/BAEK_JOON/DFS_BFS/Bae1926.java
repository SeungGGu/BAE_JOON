package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bae1926 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max = Integer.MIN_VALUE;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int painting = count(grid);
        System.out.println(painting);
        System.out.println(max);
    }

    public static int count(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visit = new boolean[rows][cols];
        int painting = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visit[i][j]) {
                    int area = bfs(grid, visit, i, j);
                    painting++;
                    max = Math.max(max, area);
                    count = 1;
                }
            }
        }
        return painting;
    }

    public static int bfs(int[][] grid, boolean[][] visit, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visit[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length &&
                        grid[nx][ny] == 1 && !visit[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    visit[nx][ny] = true;
                    count++;
                }
            }
        }
    return count;
    }
}
