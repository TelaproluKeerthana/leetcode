class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (a, b) -> b[0] - a[0]);
        for(int key : map.keySet()){
            pq.offer(new int[]{map.get(key), key});
        }

        int[] res = new int[k];
        int idx = 0;
        while(idx < k){
            res[idx++] = pq.poll()[1];
        }
    
        return res;
    }
}
