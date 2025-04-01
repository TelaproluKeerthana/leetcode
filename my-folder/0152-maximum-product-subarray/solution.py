class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        currMax = 1
        currMin = 1
        max_prod = float("-inf")
        for i in range(len(nums)):
            tmp = nums[i] * currMax
            currMax = max(tmp, currMin * nums[i], nums[i])
            currMin = min(tmp, currMin * nums[i], nums[i])
            
            max_prod = max(currMax, max_prod)
        
        return max_prod

        
