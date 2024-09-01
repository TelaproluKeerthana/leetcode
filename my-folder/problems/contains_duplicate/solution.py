class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        L=0
        dup=set()
        for R in range(len(nums)):
            if nums[R] in dup:
                return True
            dup.add(nums[R])
        return False
            
        