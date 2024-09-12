class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        blen=len(nums)
        currsum=0
        maxsum=float(-inf)
        for i in nums:
            currsum=max(0,currsum)
            currsum+=i
            maxsum=max(maxsum,currsum)
        return maxsum
            


        