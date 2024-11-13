package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bae2667 {
    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int[][] pos = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int count = 0;
    static List<Integer> answer = new ArrayList<>();

    public static void bfs(int x, int y){
        count = 1;
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x , y});

        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int nx = arr[0];
            int ny = arr[1];

            for (int i = 0; i < pos.length; i++) {
                int nowX = nx + pos[i][0];
                int nowY = ny + pos[i][1];

                if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < n && !visited[nowX][nowY] && grid[nowX][nowY] == 1){
                    visited[nowX][nowY] = true;
                    count++;
                    queue.add(new int[]{nowX, nowY});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]){
                    bfs(i, j);
                    answer.add(count);
                }
            }
        }
        System.out.println(answer.size());
        Collections.sort(answer);
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}
