class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        if not nums:
            return 0  
        num=set(nums)
        for i in range(len(nums)+1):
            if i not in num:
                return i




            

        