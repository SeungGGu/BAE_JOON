package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DfsAndBackTrakingEx1 {
    static int n, m, startX, startY, endX, endY;
    static String[][] map;
    static boolean[][] visited;
    static int[][] pos = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int max = Integer.MIN_VALUE;
    static int count;

    public static void dfs(int x, int y, int count) {
        if (x < 0 || x >= n || y < 0 || y >= m || map[x][y].equals("1") || visited[x][y]) {
            return;
        }
        if (map[x][y].equals("T")) {
            count += 1;
        }
        if (map[x][y].equals("E")) {
            max = Math.max(max, count);
            return;
        }
        visited[x][y] = true;
        for (int i = 0; i < pos.length; i++) {
            int nx = x + pos[i][0];
            int ny = y + pos[i][1];
            dfs(nx, ny, count);
        }
        visited[x][y] = false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new String[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = st.nextToken();
                if (map[i][j].equals("S")) {
                    startX = i;
                    startY = j;
                } else if (map[i][j].equals("E")) {
                    endX = i;
                    endY = j;
                }
            }
        }
        count = 0;
        dfs(startX, startY, count);
        System.out.println(max);
    }
}
