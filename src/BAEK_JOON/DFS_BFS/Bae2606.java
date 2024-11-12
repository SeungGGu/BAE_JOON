package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bae2606 {
    static int node, line;
    static int[][] grid;
    static boolean[] visited;
    static int count = 0;

    public static void dfs(int start) {
        visited[start] = true;
        count++;

        for (int i = 1; i <= node; i++) {
            if (grid[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        grid = new int[node + 1][node + 1];
        visited = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            grid[a][b] = 1;
        }

        dfs(1);

        System.out.println(count - 1);
    }
}