class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        c=0
        while any(n != 0 for n in nums):
            minnum=min((num for num in nums if num!=0),default=None)
            for i in range(len(nums)):
                if(nums[i]!=0):
                    nums[i]=nums[i]-minnum

            c+=1
        return c
        
