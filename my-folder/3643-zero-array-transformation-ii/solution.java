class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int numOfZeros = 0;
        for(int num : nums){
            if(num == 0) numOfZeros++;
        }
        if(numOfZeros == nums.length) return 0;

        for(int q = 0; q < queries.length; q++){
            int[] query = queries[q];
            int left = query[0];
            int right = query[1];
            int val = query[2];

            for(int i = left; i <= right; i++){
                int curr = nums[i];
                if(curr == 0){
                    continue;
                }
                nums[i] -= val;
                
                if(nums[i] <= 0){
                    nums[i] = 0;
                    numOfZeros++;
                } 
            }
            if(numOfZeros == nums.length) return q + 1;
        }

        return -1;
    }
}

// nums = [2,0,2]

