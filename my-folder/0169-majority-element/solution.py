class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hm={}
        for i in range(len(nums)):
            hm[nums[i]]=1+hm.get(nums[i],0)
        maxi=max(hm,key=hm.get)
        return maxi

        
