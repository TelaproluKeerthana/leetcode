class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        L=0
        for R in range(1,len(nums)):
            if nums[R]!=nums[L]:
                L+=1
                nums[L]=nums[R]
            
        return L+1
# nums = [0,1,2,3,4,2,2,3,3,4]
#                 L         R



        
