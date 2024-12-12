class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        j=len(nums)
        res=[1]*j
        prefix,suffix=1,1
        for i in range(j):
            res[i]*=prefix
            prefix*=nums[i]
        for i in range(j-1,-1,-1):
            res[i]*=suffix
            suffix*=nums[i]
        return res
