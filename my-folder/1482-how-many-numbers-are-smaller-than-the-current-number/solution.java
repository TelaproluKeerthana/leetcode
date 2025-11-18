class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int[] sortednums = Arrays.copyOf(nums, nums.length);
        int[] sortednums = nums.clone();
        Arrays.sort(sortednums);
        Map<Integer, Integer> cntMap = new HashMap<>();
        cntMap.put(sortednums[0], 0);
        for(int i = 1; i < nums.length; i++){
            cntMap.putIfAbsent(sortednums[i], i);
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = cntMap.get(nums[i]);
        }

        return res;
    }
}

// [8,1,2,2,3]
// 1 2 2 3 8
// 0 1 1 3 4

