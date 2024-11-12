package Practice;

import java.util.*;

public class RecursiveDFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>(); // 그래프를 인접 리스트로 표현
    private Set<Integer> visited = new HashSet<>(); // 방문한 노드를 기록할 Set

    // 그래프에 간선을 추가하는 메서드
    public void addEdge(int start, int end) {
        graph.putIfAbsent(start, new ArrayList<>());
        graph.putIfAbsent(end, new ArrayList<>());
        graph.get(start).add(end);
        graph.get(end).add(start); // 무방향 그래프일 경우
    }

    // DFS 재귀 메서드
    public void dfs(int node) {
        if (visited.contains(node)) return; // 이미 방문한 경우 종료

        visited.add(node); // 현재 노드를 방문 표시
        System.out.println("방문한 노드: " + node);

        // 현재 노드와 연결된 모든 노드를 재귀적으로 방문
        for (int neighbor : graph.get(node)) {
            dfs(neighbor); // 연결된 노드로 이동
        }
    }

    public static void main(String[] args) {
        RecursiveDFS dfsExample = new RecursiveDFS();

        // 그래프 구성
        dfsExample.addEdge(1, 2);
        dfsExample.addEdge(1, 3);
        dfsExample.addEdge(2, 4);
        dfsExample.addEdge(2, 5);
        dfsExample.addEdge(3, 6);

        // DFS 탐색 시작
        System.out.println("DFS 탐색 시작:");
        dfsExample.dfs(1); // 시작 노드를 1로 설정
    }
}
