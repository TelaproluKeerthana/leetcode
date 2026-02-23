class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int stone : stones){
            pq.offer(stone);
        }

        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            if(first == second){
                continue;
            }
            pq.offer(first - second);
        }

        return pq.size() == 1 ? pq.poll() : 0;
    }
}

// [2,7,4,1,8,1] = [2, 4, 1, 1, 1] 
// f = 7
// s = 8
// (8  - 7 ) = 1
// (2, 4) = 2
// 1112
// (12) = 1
// 111
// (11) = 1
