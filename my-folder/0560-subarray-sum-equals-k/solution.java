class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> subArrayCounter = new HashMap<>(); 
        subArrayCounter.put(0, subArrayCounter.getOrDefault(0, 1));
        int prefixSum = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            int diff = prefixSum - k;
            res += subArrayCounter.getOrDefault(diff, 0);
            subArrayCounter.put(prefixSum, subArrayCounter.getOrDefault(prefixSum, 0) + 1);
        }
        return res;
    }
}
