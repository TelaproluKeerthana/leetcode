class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];

        for(int num : nums){
            currSum += num;
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }

        return maxSum;
    }
}
// ms = 4
// cs = 4

// [-2,1,-3,4,-1,2,1,-5,4]        
// maxSum = 6
// cs = 6 - 5 = 1 + 4 = 5
