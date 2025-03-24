class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm_nums = {val:i for i, val in enumerate(nums)}
        for i,val in enumerate(nums):
            a = val
            if (target - a in hm_nums and i != hm_nums[target - a]):
                return [i, hm_nums[target - a]]
        
        return [-1, -1]        

# [2,7,11,15]
#  i 
#    j 
# a = 2
# j = 7
          
