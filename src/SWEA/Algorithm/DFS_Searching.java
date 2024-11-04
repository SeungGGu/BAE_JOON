package SWEA.Algorithm;

import java.util.Scanner;

public class DFS_Searching {
    static final int MAX_VERTEX = 30;         // 그래프의 최대 정점 수를 30으로 설정
    static int[][] map = new int[MAX_VERTEX][MAX_VERTEX];  // 인접 행렬로 그래프를 표현
    static boolean[] visit = new boolean[MAX_VERTEX];      // 정점 방문 여부를 저장하는 배열
    static int vertex;    // 정점 개수
    static int edge;      // 간선 개수
    static int maxEdge;   // 최단 경로 길이를 저장할 변수
    static int start;     // 시작 정점
    static int end;       // 끝 정점

    // DFS 메서드: 현재 정점 v에서 시작하여 깊이 depth까지 탐색
    public static void depthFirstSearch(int v, int depth) {
        System.out.printf("현재 노드: %d, 깊이: %d\n", v, depth); // 현재 상태를 출력하는 로그

        // 종료 조건: 현재 정점이 목표 정점과 같은 경우
        if (v == end) {
            System.out.printf("목표 노드 %d 도착, 경로 길이: %d\n", v, depth); // 목표 노드 도착 로그
            if (maxEdge < 0 || depth < maxEdge) { // 현재 경로가 더 짧으면 갱신
                maxEdge = depth;
                System.out.printf("최단 경로 갱신: %d\n", maxEdge); // 최단 경로 갱신 로그
            }
            return;
        }

        visit[v] = true; // 현재 정점을 방문 표시
        for (int i = 1; i <= vertex; i++) { // 모든 정점 탐색
            if (map[v][ i] == 1 && !visit[i]) { // 연결된 정점 중 방문하지 않은 정점으로 이동
                System.out.printf("노드 %d -> 노드 %d로 이동\n", v, i); // 이동 로그
                depthFirstSearch(i, depth + 1); // 깊이 +1 증가시키며 DFS 재귀 호출
                visit[i] = false; // 백트래킹: 탐색이 끝나면 방문 표시 해제
                System.out.printf("노드 %d로 돌아옴 (백트래킹)\n", v); // 백트래킹 로그
            }
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int test_case = 1; test_case <= T; test_case++) {
            vertex = sc.nextInt(); // 정점 수
            edge = sc.nextInt();   // 간선 수
            start = sc.nextInt();  // 시작 정점
            end = sc.nextInt();    // 목표 정점

            // 그래프 초기화
            map = new int[MAX_VERTEX][MAX_VERTEX];
            visit = new boolean[MAX_VERTEX];

            // 간선 정보 입력
            for (int i = 0; i < edge; i++) {
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                map[v1][v2] = 1; // v1에서 v2로 가는 간선 설정
            }

            maxEdge = -1; // 최단 경로 초기화

            System.out.printf("테스트 케이스 #%d 시작: 시작 노드 %d, 목표 노드 %d\n", test_case, start, end); // 테스트 케이스 시작 로그
            depthFirstSearch(start, 0); // DFS 탐색 시작
            System.out.printf("#%d 최단 경로 길이: %d\n", test_case, maxEdge); // 결과 출력
        }

        sc.close(); // 입력 스트림 종료
    }
}
