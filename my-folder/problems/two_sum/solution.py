class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
       l = len(nums)
       for i in range(l):
           pink = target - nums[i]
           if pink in nums:
               b=nums.index(pink)
               if i!=b:
                   return [i,b]



            
      

