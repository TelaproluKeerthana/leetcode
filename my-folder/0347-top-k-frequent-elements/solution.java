class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        ArrayList<Integer> alist = new ArrayList<>();
        for(int num : nums){
            counter.put(num, 1 + counter.getOrDefault(num , 0));
        }

        PriorityQueue<int[]> que = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        //  PriorityQueue<int[]> que = new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Integer, Integer> curr : counter.entrySet()){
            que.offer(new int[]{curr.getValue(), curr.getKey()});
        }

        int[] res = new int[k];
        int idx = 0;
        while(k > 0){
            int[] curr = que.poll();
            res[idx++] = curr[1];
            k--;
        }

        return res;
    }
}

// 1 : 3
// 2 : 2
// 3 : 1
