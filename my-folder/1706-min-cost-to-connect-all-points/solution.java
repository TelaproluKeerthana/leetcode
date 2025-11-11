class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        Map<Integer, List<int[]>> adjList = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j = i + 1; j < n; j++){
                int x2 = points[j][0];
                int y2 = points[j][1];
                int dist = Math.abs(x1 - x2) + Math.abs(y1  - y2);
                adjList.computeIfAbsent(i, k -> new ArrayList<>()).add(new int[]{dist, j});
                adjList.computeIfAbsent(j, k -> new ArrayList<>()).add(new int[]{dist, i});
            }
        }

        int res = 0;
        HashSet<Integer> visit = new HashSet<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        minHeap.offer(new int[]{0, 0});

        while(visit.size() < n){
            int[] curr = minHeap.poll();
            int cost = curr[0], node = curr[1];
            if(visit.contains(node)){
                continue;
            }

            res += cost;
            visit.add(node);
            for(int[] neis : adjList.getOrDefault(node, new ArrayList<>())){
                if(!visit.contains(neis[1])){
                    minHeap.offer(neis);
                }
            }
        }

        return res;

    }
}

// this is the prims algorithm implementation of the minimum spanning tree
// here we calculate the edge weights of each node and store them in a list 

// we make use of priority queue to create and keep the weight and node and a visit set to cover all the nodes or points 

// its gonna take O(n^2) to build the adjList and logn to pop from the priority queue - O(n^2logn)
