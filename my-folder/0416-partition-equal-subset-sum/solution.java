class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        for(int num : nums){
            totalSum += num;
        }
        dp = new Boolean[n][totalSum/2 + 1];

        if(totalSum % 2 != 0){
            return false;
        }

        return dfs(0, totalSum / 2, nums);
    }

    private boolean dfs(int idx, int target, int[] nums){
        if(target < 0){
            return false;
        }

        if(idx == nums.length){
            return target == 0;
        }
        if(dp[idx][target] != null){
            return dp[idx][target];
        }

        dp[idx][target] = dfs(idx + 1, target - nums[idx], nums) || dfs(idx + 1, target, nums);  

        return dp[idx][target];
    }
}
