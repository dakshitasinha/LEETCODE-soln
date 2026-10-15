import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];
        return dfs(graph, visited, source, destination);
    }

    boolean dfs(List<List<Integer>> graph, boolean[] visited,
                int node, int destination) {
        if (node == destination) return true;

        visited[node] = true;

        for (int next : graph.get(node)) {
            if (!visited[next] &&
                dfs(graph, visited, next, destination)) {
                return true;
            }
        }

        return false;
    }
}