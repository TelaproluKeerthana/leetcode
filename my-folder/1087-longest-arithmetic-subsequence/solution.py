class Solution:
    def longestArithSeqLength(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [{} for _ in range(n)]
        max_len = 0
        for i in range(n):
            for j in range(i):
                diff = nums[i] - nums[j]
                dp[i][diff] = dp[j].get(diff,1) + 1
                max_len = max(dp[i][diff], max_len)

        return max_len



                





        

