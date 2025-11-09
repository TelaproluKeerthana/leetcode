import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Step 1: Build adjacency list with weights
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] time : times) {
            adj.computeIfAbsent(time[0], x -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }

        // Step 2: Min-heap based on shortest time
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});

        // Step 3: Distance map
        Map<Integer, Integer> dist = new HashMap<>();

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0], time = curr[1];

            if (dist.containsKey(node)) continue; // Already processed
            dist.put(node, time);

            if (adj.containsKey(node)) {
                for (int[] nei : adj.get(node)) {
                    int next = nei[0], w = nei[1];
                    if (!dist.containsKey(next)) {
                        pq.offer(new int[]{next, time + w});
                    }
                }
            }
        }

        // Step 4: If not all nodes reached → return -1
        if (dist.size() != n) return -1;

        // Step 5: The answer is the longest shortest time
        int ans = 0;
        for (int time : dist.values()) {
            ans = Math.max(ans, time);
        }
        return ans;
    }
}


// class Solution {
//     public int networkDelayTime(int[][] times, int n, int k) {
//         Map<Integer, List<int[]>> adjList = new ArrayList<>();
    
//         for(int[]  time : times){
//             int src = time[0], dst = time[1];
//             adjList.computeIfAbsent(time[0], x -> new ArrayList<>()).add(new int[]{time[1], time[2]});
//         }

//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
//         pq.offer(new int[]{k, 0});

//         Map<Integer, Integer> dist = new HashMap<>();

        
//         while(!pq.isEmpty()){
//             int curr = pq.poll();
//             for(int[] nei : adjList.get(curr)){
//                 int next = nei[0], w = nei[1];
//                 if (!dist.containsKey(next)) {
//                     pq.offer(new int[]{next, time + w});
//                 }
//             }
//         }



//     return visited.size() == n ? levels : -1;
//     }
// }

// times = 
// [[2,1,1],[2,3,1],[3,4,1]]
// n = 4, k = 2

// 2 : 1, 3

// 3 : 4


// 1, 2, 1

// 1 -> 2

// k = 2
