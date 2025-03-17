class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        #kadane's algo
        currsum = 0
        maxprod = nums[0]
        currMax, currMin = 1,1
        for num in nums:
            tmp = num * currMax
            currMax = max(num * currMax, num * currMin, num)
            currMin = min(tmp, num * currMin, num)
            maxprod  = max(currMax, maxprod)
        
        return maxprod
