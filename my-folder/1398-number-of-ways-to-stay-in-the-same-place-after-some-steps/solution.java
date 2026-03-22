class Solution {
    public int numWays(int steps, int arrLen) {
        int mod = 1_000_000_007;
        
        int maxPos = Math.min(steps, arrLen - 1);
        int[] dp = new int[maxPos + 1];
        
        dp[0] = 1;
        
        for (int i = 1; i <= steps; i++) {
            int[] nextDp = new int[maxPos + 1];
            for (int j = 0; j <= maxPos; j++) {
                long ways = dp[j];
                
                if (j > 0) {
                    ways = (ways + dp[j - 1]) % mod;
                }
                
                if (j < maxPos) {
                    ways = (ways + dp[j + 1]) % mod;
                }
                
                nextDp[j] = (int) ways;
            }
            dp = nextDp;
        }
        
        return dp[0];
    }
}
