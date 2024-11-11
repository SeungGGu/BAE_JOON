package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    // 방향 배열 (상, 하, 좌, 우)
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void bfs(int[][] grid, int startX, int startY) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 현재 위치에서 상하좌우로 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 배열 범위 내에 있고, 방문하지 않은 노드일 때
                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && !visited[nx][ny] && grid[nx][ny] == 1) {
                    queue.add(new int[] { nx, ny });
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = new int[5][5];
        bfs(grid, 0, 0);
    }
}
