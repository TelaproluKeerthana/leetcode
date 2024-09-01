class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        ops=0
        while any(num>0 for num in nums):
            x=min(num for num in nums if(num>0))
            nums= [num-x if num>0 else num for num in nums]
            ops+=1
        return ops

        # ops=0
        # a=min(nums)
        # second_min=float(inf)
        # for i in range(len(nums)):
        #     if(nums[i]>a and nums[i]<second_min):
        #         second_min=nums[i]
        # while(all(nums==0)):
        #     x=a if a!=0 else x==second_min

        #     for i in range(len(nums)):
        #         if(nums[i]>0):
        #             nums[i]-=x
        # ops+=1
                
            
        