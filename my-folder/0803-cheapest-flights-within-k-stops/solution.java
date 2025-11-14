class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] f : flights) {
            adjList.get(f[0]).add(new int[]{f[1], f[2]});
        }

        // prices[node] = min cost to reach node
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;

        Queue<int[]> q = new LinkedList<>();
        // {node, cost, stops}
        q.offer(new int[]{src, 0, 0});

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0];
            int cost = curr[1];
            int stops = curr[2];

            if (stops > k) continue;

            for (int[] nei : adjList.get(node)) {
                int next = nei[0];
                int price = nei[1];

                if (cost + price < prices[next]) {
                    prices[next] = cost + price;
                    q.offer(new int[]{next, prices[next], stops + 1});
                }
            }
        }

        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }
}

