package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DfsEx1 {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[][] pos = {{1,0}, {-1,0}, {0,-1}, {0,1}};
    static int count = 0;

    public static void dfs(int x, int y){
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return;
        }
        if (map[x][y] == 0 || visited[x][y]){
            return;
        }

        visited[x][y] = true;

        for (int i = 0; i < pos.length; i++) {
            dfs(x + pos[i][0], y + pos[i][1]);
        }

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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visited[i][j]){
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
