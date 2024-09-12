class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res=[1]*len(nums)
        pre,sufi=1,1
        blen=len(nums)
        for i in range(blen):
            res[i]*=pre
            pre*=nums[i]
        for j in range(blen-1,-1,-1):
            res[j]*=sufi
            sufi*=nums[j]
                
    
        return res

        