package BAEK_JOON.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bae11060 {
    static int n;
    static int[] miro;
    static int[] jumps;

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);   // 0
        jumps[start] = 0;   // 0

        while (!queue.isEmpty()) {
            int nx = queue.poll();  //현재위치 0    // 현재위치 1
            int maxJump = miro[nx]; //점프    miro[0] = 1  //miro[1] = 2

            if (nx >= n - 1) {      //
                System.out.println(jumps[nx]);
                return;
            }

            for (int i = 1; i <= maxJump; i++) {  // 1 ~ 1 / 1 ~ 2 /
                int next = nx + i;  //다음위치 1    // 다음위치 2 , 3 //

                if (next < n && jumps[next] == -1) {
                    jumps[next] = jumps[nx] + 1; // jump[1] = 1 // jump[2] = 2 , jump[3] = 2 //
                    queue.add(next);            // 큐에 1추가 큐에 2 / 3 추가
                }
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        miro = new int[n];
        jumps = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            miro[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            jumps[i] = -1;
        }
        bfs(0);
    }
}
