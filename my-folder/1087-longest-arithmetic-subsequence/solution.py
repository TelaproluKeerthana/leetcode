class Solution:
    def longestArithSeqLength(self, nums: List[int]) -> int:
        n = len(nums)
        # creating list of hashmaps to store all elements and the subsequence length
        dp = [{} for _ in range(n)]
        res = 2
        for i in range(n):
            for j in range(i + 1, n):
                diff = nums[j] - nums[i]
                if diff in dp[i]:
                    dp[j][diff] = dp[i][diff] + 1
                else:
                    dp[j][diff] = 2
                
                res = max(res, dp[j][diff])

        return res
                





        

