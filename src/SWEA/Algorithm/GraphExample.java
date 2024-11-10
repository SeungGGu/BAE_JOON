package SWEA.Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphExample {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);

        for (int node : graph.keySet()) {
            System.out.println("노드" + node + "의 인접 노드들: " + graph.get(node));
        }

    }

    private static void addEdge(Map<Integer, List<Integer>> graph, int start, int end){
        graph.putIfAbsent(start, new ArrayList<>());
        graph.putIfAbsent(end, new ArrayList<>());
        graph.get(start).add(end);
        graph.get(end).add(start);
    }
}
