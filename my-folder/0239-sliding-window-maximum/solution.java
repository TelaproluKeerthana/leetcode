class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int right = 0;
        Queue<Integer> window = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(right < nums.length){
            int curr = nums[right++];
            window.offer(curr);
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            if(k == window.size()){
                res.add(map.lastKey());
                int removeKey = window.poll();
                map.put(removeKey, map.get(removeKey) - 1);
                if(map.get(removeKey) == 0){
                    map.remove(removeKey);
                }
            }
        }

        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }

        return result;
    }
}
// currMax = 3
// 1 3 -1 -3
// [1,3,-1,-3,5,3,6,7]
