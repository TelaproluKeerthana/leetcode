class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        lis={}
        for i in range(len(nums)):
            lis[nums[i]]=lis.get(nums[i],0)+1
        for i in lis.values():
            if i>1:
                return True
        return False
        
