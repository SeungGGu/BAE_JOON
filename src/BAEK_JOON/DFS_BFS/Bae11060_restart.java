package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bae11060_restart {
    static int n;
    static int[]grid;
    static boolean[]visit;
    static int[] count;

    public static void bfs(int x){ // 0 ~ 9
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        count[x] = 0;   // 0

        while (!queue.isEmpty()){
            int nowX = queue.poll();
            int jumpSize = grid[nowX];

            if (nowX >= n-1){
                System.out.println(count[nowX]);
                return;
            }
            for (int i = 1; i <= jumpSize; i++) {
                if ((nowX + i) < n && !visit[nowX + i]){
                    count[nowX + i] = count[nowX] + 1;
                    visit[nowX + i] = true;
                    queue.add(nowX+i);
                }
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        grid = new int[n];
        count = new int[n];
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            grid[i] = Integer.parseInt(st.nextToken());
        }
        bfs(0);
    }
}
