package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bae2583 {
    static int n, m, k;
    static int[][] arr;
    static boolean[][] visited;
    static int count = 0;
    static int[][] pos = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    static List<Integer> answer = new ArrayList<>();

    public static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        count = 1;

        while (!queue.isEmpty()) {
            int[] grid = queue.poll();
            int nowX = grid[0];
            int nowY = grid[1];

            for (int i = 0; i < pos.length; i++) {
                int nx = nowX + pos[i][0];
                int ny = nowY + pos[i][1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0 && !visited[nx][ny]) {
                    count++;
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int startY = Integer.parseInt(st.nextToken());
            int startX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());

            int x = Math.abs(startX - endX);
            int y = Math.abs(startY - endY);
            int minX = Math.min(startX, endX);
            int minY = Math.min(startY, endY);
            //1 1 2 5  x = 1 minX = 1 y = 4 minY = 1
            for (int j = minX; j < minX + x; j++) {   // 1 -> 2 / 1
                for (int l = minY; l < minY + y; l++) { // 1 -> 5 / 1 2 3 4
                    arr[j][l] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0 && !visited[i][j]){
                    bfs(i, j);
                    answer.add(count);
                }
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i));
            System.out.print(" ");
        }
    }
}
