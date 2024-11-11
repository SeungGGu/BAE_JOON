package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class CabbageFarm {
    static int[] dx = { -1, 1, 0, 0 }; // 상하좌우 방향
    static int[] dy = { 0, 0, -1, 1 };

    public static int countWorms(int[][] farm) {
        int rows = farm.length;
        int cols = farm[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int wormCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 배추가 있고 방문하지 않은 위치에서 BFS 시작
                if (farm[i][j] == 1 && !visited[i][j]) {
                    bfs(farm, visited, i, j);
                    wormCount++; // 새로운 지렁이 필요
                }
            }
        }
        return wormCount;
    }

    private static void bfs(int[][] farm, boolean[][] visited, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 현재 위치의 상하좌우 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 내에 있고, 배추가 있으며, 방문하지 않은 경우
                if (nx >= 0 && nx < farm.length && ny >= 0 && ny < farm[0].length &&
                    farm[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[] { nx, ny });
                    visited[nx][ny] = true; // 방문 표시
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] farm = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 1, 1, 0},
            {1, 0, 1, 0, 1}
        };

        System.out.println("필요한 지렁이 수: " + countWorms(farm));
    }
}
