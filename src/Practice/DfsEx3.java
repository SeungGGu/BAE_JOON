package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsEx3 {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[][] pos = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    static int min = Integer.MAX_VALUE;

    public static void dfs(int x, int y, int step){
        if (x < 0 || x >= n || y < 0 || y >= m || map[x][y] == 0 || visited[x][y]) {
            return;
        }

        if (x == n -1 && y == m -1){
            min = Math.min(min, step);
            return;
        }

        visited[x][y] = true;

        for (int i = 0; i < pos.length; i++) {
            int nx = x+pos[i][0];
            int ny = y+pos[i][1];
            dfs(nx, ny, step+1);
        }

        visited[x][y] = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0, 1);

        if (min == Integer.MAX_VALUE){
            System.out.println("-1");
        }else {
            System.out.println(min);
        }
    }
}
