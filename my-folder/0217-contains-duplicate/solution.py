class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hm=set()
        for i in nums:
            if i not in hm:
                hm.add(i)
            else:
                return True
        return False
        
