package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bae11724 {
    static int node;
    static int line;
    static int count;
    static ArrayList<Integer>[] grid;
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
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());

        grid = new ArrayList[node + 1];
        for (int i = 1; i <= node; i++) {
            grid[i] = new ArrayList<>();
        }
        visited = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            grid[a].add(b);
            grid[b].add(a);
        }

        count = 0;
        for (int i = 1; i <= node; i++) {
            if (!visited[i]) {
                count++;
                bfs(i);
            }
        }
        System.out.println(count);
    }
}
