import java.util.*;

class Solution {
    List<int[]>[] graph;
    int[] res;

    public int[] minEdgeReversals(int n, int[][] edges) {
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            int u = e[0], v = e[1];
            graph[u].add(new int[]{v, 0}); 
            graph[v].add(new int[]{u, 1});
        }

        res = new int[n];

        res[0] = dfs(0, -1);

        reroot(0, -1);

        return res;
    }

    private int dfs(int node, int parent) {
        int count = 0;

        for (int[] nei : graph[node]) {
            int next = nei[0], cost = nei[1];
            if (next == parent) continue;

            count += cost + dfs(next, node);
        }

        return count;
    }

    private void reroot(int node, int parent) {
        for (int[] nei : graph[node]) {
            int next = nei[0], cost = nei[1];
            if (next == parent) continue;

            if (cost == 0) {
                res[next] = res[node] + 1;
            } else {
                res[next] = res[node] - 1;
            }

            reroot(next, node);
        }
    }
}
