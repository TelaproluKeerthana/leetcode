class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) {
            return 0;
        }
        if (stones.length == 1) {
            return stones[0];
        }
        
        PriorityQueue<Integer> weights = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            weights.add(stone);
        }
        
        while (weights.size() > 1) {
            int first = weights.poll();
            int second = weights.poll();
            if (first != second) {
                weights.add(first - second); // since first > second in max-heap, no need for abs
            }
        }
        
        return weights.isEmpty() ? 0 : weights.peek();
    }
}

