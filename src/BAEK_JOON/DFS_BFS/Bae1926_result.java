package BAEK_JOON.DFS_BFS;

import java.util.*;

public class Bae1926_result {
    static int n, m;  // 도화지의 세로(n), 가로(m) 크기
    static int[][] graph;  // 그림 정보가 담긴 2차원 배열
    static boolean[][] visited;  // 방문 여부를 기록하는 배열
    static int count = 0;  // 현재 그림의 넓이를 기록하는 변수
    static int[][] pos = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};  // 상하좌우 방향을 나타내는 배열

    // BFS 메서드: 주어진 (x, y) 좌표에서 시작하여 연결된 모든 1을 탐색하며 count를 증가시킴
    static void bfs(int x, int y) {
        visited[x][y] = true;  // 시작 지점 방문 처리
        Queue<int[]> queue = new LinkedList<>();  // BFS 탐색을 위한 큐 생성
        queue.add(new int[]{x, y});  // 시작 지점 큐에 추가

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();  // 큐에서 현재 위치를 꺼냄
            int nowX = arr[0];
            int nowY = arr[1];

            // 현재 위치의 상하좌우를 탐색
            for (int i = 0; i < pos.length; i++) {
                int nx = nowX + pos[i][0];
                int ny = nowY + pos[i][1];

                // 유효한 좌표인지 확인 후 방문 여부 체크
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && graph[nx][ny] == 1 && !visited[nx][ny]) {
                    count++;  // 그림의 넓이 증가
                    visited[nx][ny] = true;  // 방문 처리
                    queue.add(new int[]{nx, ny});  // 큐에 인접 위치 추가
                    System.out.println("BFS 탐색 중 - 현재 넓이: " + count + ", 위치: (" + nx + ", " + ny + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();  // 세로 크기 입력
        m = sc.nextInt();  // 가로 크기 입력
        boolean zero = true;  // 그림이 하나도 없는 경우를 처리하기 위한 변수
        List<Integer> answer = new ArrayList<>();  // 각 그림의 넓이를 저장하는 리스트

        graph = new int[n][m];  // 도화지 초기화
        visited = new boolean[n][m];  // 방문 여부 배열 초기화

        // 그림 정보 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = sc.nextInt();  // 0 또는 1 입력
                if (graph[i][j] == 1) {
                    zero = false;  // 1이 하나라도 있으면 zero를 false로 설정
                }
            }
        }

        // 그림이 하나도 없을 경우
        if (zero) {
            System.out.println("0");
            System.out.println("0");
            return;  // 프로그램 종료
        }

        // 도화지의 모든 좌표를 탐색하며 BFS 실행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count = 0;  // 새로운 그림을 탐색하기 위해 count를 0으로 초기화
                if (graph[i][j] == 1 && !visited[i][j]) {  // 그림이 있고 방문하지 않은 위치에서
                    count++;  // 현재 그림의 넓이를 1로 설정
                    System.out.println("새로운 그림 탐색 시작 - 시작 위치: (" + i + ", " + j + ")");
                    bfs(i, j);  // BFS 실행하여 연결된 그림의 넓이 계산
                    answer.add(count);  // 그림의 넓이를 answer 리스트에 추가
                    System.out.println("그림의 최종 넓이: " + count);
                }
            }
        }

        // 모든 그림의 넓이를 계산 후 결과 출력
        Collections.sort(answer);  // 그림의 넓이를 정렬하여 최대값을 구하기 위해 정렬
        System.out.println("그림의 개수: " + answer.size());  // 총 그림의 개수 출력
        System.out.println("가장 큰 그림의 넓이: " + answer.get(answer.size() - 1));  // 가장 큰 그림의 넓이 출력
    }
}
