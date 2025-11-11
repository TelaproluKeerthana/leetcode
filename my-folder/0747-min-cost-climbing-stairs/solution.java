class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // int[] dp = new int[n + 2];
        int currStep = 0;
        int prevStep = 0;
        for(int i = n - 1; i >= 0; i--){
            int curr = cost[i] + Math.min(currStep, prevStep);
            prevStep = currStep;
            currStep = curr;
        }

    return Math.min(currStep, prevStep);
    }
}

// [10,15,20]
// 15




