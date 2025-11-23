public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        Arrays.fill(LIS, 1);

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    LIS[i] = Math.max(LIS[i], 1 + LIS[j]);
                }
            }
        }
        return Arrays.stream(LIS).max().getAsInt();
    }
}
// dp[4]
// 3 
// max(1, 3) = 3
// max(3, 1)
//   7 101 18
// dp[3]
// 5,
//   3,7,101,18
// dp[3] = 1 + dp[5] = 4
//       = 1 + dp[6] = 4 its max

// dp = [2 2 4  3 3 2 1 1]
// max(dp) = 4

