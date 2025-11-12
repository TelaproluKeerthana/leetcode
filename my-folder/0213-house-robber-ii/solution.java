class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        
        
        int robFirst = robBanks(nums, 0, nums.length - 2);
        int robLast = robBanks(nums, 1, nums.length - 1); 

        return Math.max(robFirst, robLast);
    }
    
    private int robBanks(int[] nums, int start, int end){

        int prevRob = nums[start];
        int currRob = Math.max(nums[start], nums[start + 1]);

        for(int idx = start + 2; idx <= end; idx++){
            int temp = currRob;
            currRob = Math.max(currRob, prevRob + nums[idx]);
            prevRob = temp;
        }

        return currRob;
    }
}

//  [2,3,2]
//  prevRob = 2
//  currRob = 3
//  max
