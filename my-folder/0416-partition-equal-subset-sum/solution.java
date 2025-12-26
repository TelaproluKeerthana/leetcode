class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int num:nums){
            totalSum += num;
        }

        if(totalSum % 2 != 0){
            return false;
        }

        int half = totalSum / 2;
        boolean[] dp = new boolean[half + 1];
        dp[0] = true;
        for(int num : nums){
            for(int s = half; s >= num; s--){
                dp[s] = dp[s] || dp[s - num];
            }
        }

        return dp[half];
        


    }
}

// sum = 1+5+11+5 = 22/2 = 11
// firstHalfSum = 0;
// secondHalfSum = 0;
// array = [1, 5, 5, 11]
//          l     r
// sum = 1+2+3+5 = 11/2 
// cantt split into 2 subsets
