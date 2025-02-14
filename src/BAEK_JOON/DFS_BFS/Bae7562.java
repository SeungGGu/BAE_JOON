package BAEK_JOON.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bae7562 {
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static int bfs(int l, int startX, int startY, int endX, int endY) {
        if (startX == endX && startY == endY) {
            return 0;
        }

        boolean[][] visited = new boolean[l][l];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], moves = curr[2];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                    if (nx == endX && ny == endY) {
                        return moves + 1;
                    }
                    queue.add(new int[]{nx, ny, moves + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int l = sc.nextInt();
            int startX = sc.nextInt(), startY = sc.nextInt();
            int endX = sc.nextInt(), endY = sc.nextInt();

            System.out.println(bfs(l, startX, startY, endX, endY));
        }
    }
}


