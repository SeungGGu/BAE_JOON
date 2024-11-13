package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bae11725 {
    static int n;
    static ArrayList<Integer>[] grid;
    static int[] parents;
    static boolean[] visited;

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : grid[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    parents[next] = now;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        grid = new ArrayList[n +1];
        visited = new boolean[n + 1];
        parents = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            grid[i] = new ArrayList<>();
        }

        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            grid[a].add(b);
            grid[b].add(a);
        }
        bfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }
}
