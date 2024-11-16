package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bae1260 {
    static int node, line, start;
    static int[][] map;
    static StringBuffer bfsSb = new StringBuffer();
    static StringBuffer dfsSb = new StringBuffer();
    static boolean[] visitedDfs;
    static boolean[] visitedBfs;

    static void dfs(int start){
        visitedDfs[start] = true;
        dfsSb.append(start + " ");

        for (int i = 1; i <= node; i++) {
            if (map[start][i] == 1 && !visitedDfs[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visitedBfs[start] = true;

        while (!queue.isEmpty()){
            int temp = queue.poll();
            bfsSb.append(temp + " ");

            for (int i = 1; i <= node; i++) {
                if (map[temp][i] == 1 && !visitedBfs[i]){
                    queue.add(i);
                    visitedBfs[i] = true;
                }
            }

        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        map = new int[node+1][node+1];
        visitedDfs = new boolean[node+1];
        visitedBfs = new boolean[node+1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }
        dfs(start);
        bfs(start);

        System.out.println(dfsSb.toString());
        System.out.println(bfsSb.toString());
    }
}
