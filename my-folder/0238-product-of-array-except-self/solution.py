class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        pref = 1
        suff = 1
        
        for idx in range(len(nums)):
            res[idx] = pref
            pref *= nums[idx]
        
        for idx in range(len(nums) - 1, -1, -1):
            res[idx] *= suff
            suff *= nums[idx]
        
        return res
        
