class Solution:
    def rob(self, nums: List[int]) -> int:
    
        if len(nums) == 1:
            return nums[0]
        
        if len(nums) == 2:
            return max(nums)
        
        return max(self.robb(nums[1:]) , self.robb(nums[:-1]))

    def robb(self, arr):
        if not arr:
            return 0

        if len(arr) == 1:
            return arr[0]
        
        dp = [0] * len(arr)
        dp[0] = arr[0]
        dp[1] = max(arr[0], arr[1])
        for num in range(2, len(arr)):
            dp[num] = max(arr[num] + dp[num - 2], dp[num - 1])
        
        return dp[-1]









        
