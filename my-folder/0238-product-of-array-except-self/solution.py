class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pref = [-1] * len(nums)
        suff = [-1] * len(nums)
        pref[0] = 1
        suff[len(nums) - 1] = 1
        
        for idx in range(1, len(nums)):
            pref[idx] = pref[idx - 1] * nums[idx - 1]
        
        for idx in range(len(nums) - 2, -1, -1):
            suff[idx] = suff[idx + 1] * nums[idx + 1]
        
        for i in range(len(pref)):
            pref[i] = pref[i] * suff[i]
            
        return pref
        
