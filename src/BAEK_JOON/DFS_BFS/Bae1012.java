package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bae1012 {
    static int n, m, k;
    static int[][] arr;
    static boolean[][] visited;
    static int count = 0;
    static int[][] pos = {{0,-1}, {0,1}, {-1,0}, {1,0}};

    public static void bfs(int startX, int startY){
        visited[startX][startY] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {startX, startY});

        while (!queue.isEmpty()){
            int[] arr2 = queue.poll();
            int nowX = arr2[0];
            int nowY = arr2[1];

            for (int i = 0; i < pos.length; i++) {
                int nx = nowX + pos[i][0];
                int ny = nowY + pos[i][1];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && arr[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= t; test_case++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[m][n];
            visited = new boolean[m][n];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = 1;
            }

            count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 1 && !visited[i][j]){
                        count++;
                        bfs(i,j);
                    }
                }
            }
            System.out.println(count);
        }
    }
}
