class Solution {   

    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        int n = edges.length;
        int[] indegree = new int[n + 1];
        for(int i = 0; i <= n; i++)  adjList.add(new ArrayList<>());

        for(int[] edge : edges){
            int from = edge[0];
            int to = edge[1];
            adjList.get(from).add(to);
            adjList.get(to).add(from);
            indegree[from]++;
            indegree[to]++;
        }

        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            if(indegree[i] == 1) que.offer(i);
        }

        while(!que.isEmpty()){
            int node = que.poll();
            indegree[node]--;
            for(int nei : adjList.get(node)){
                indegree[nei]--;
                if(indegree[nei] == 1) que.offer(nei);
            }
        }

        for(int i = n - 1; i >= 0; i--){
            int from = edges[i][0];
            int to = edges[i][1];
            if(indegree[from] == 2 & indegree[to] > 0){
                return new int[]{from, to};
            }
        }

        return new int[0];
    }
}
