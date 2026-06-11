class Solution {
    Map<Integer, List<Integer>> map;
    int MOD = 1_000_000_007;
    public int assignEdgeWeights(int[][] edges) {
        map= new HashMap<>();

        for(int[] edge : edges){
            map.putIfAbsent(edge[0], new ArrayList<>());
            map.putIfAbsent(edge[1], new ArrayList<>());
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        // get max depth,
        int maxD = dfs(1, -1, 0);

        // find how many paths exists between the nodes 
        return modPow(2, maxD - 1);
    }

    private int dfs(int node, int parent, int depth){
        int maxDepth = depth;
        List<Integer> neigh = map.getOrDefault(node, new ArrayList<>());
        for(int nei : neigh){
            if(nei != parent){
                maxDepth = Math.max(maxDepth, dfs(nei, node, depth + 1));
            }
        }

        return maxDepth;
    }

    private int modPow(long base, int exp) {
        long res = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return (int) res;
    }


}

// {1 : [2, 3]
// 2 : [1],
// 3 : [1, 4, 5],
// 4 : [3],
// 5 : [3],
// }
// build an adjacency list 
// do dfs on the nodes 
// get max depth

// see through how many paths i can reach that route 

