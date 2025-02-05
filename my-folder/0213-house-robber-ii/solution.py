class Solution:
    def rob(self, nums: List[int]) -> int:
        return max(nums[0],self.helper(nums[1:]),self.helper(nums[:-1]))
        #considering the case where there is only one element then it will be the max value and it will be retured.
    def helper(self,nums):
        rob1,rob2=0,0
        for n in nums:
            tmp=max(rob1+n,rob2)
            rob1=rob2
            rob2=tmp
        return rob2
