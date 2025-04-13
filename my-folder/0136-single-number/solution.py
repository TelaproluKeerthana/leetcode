class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        single = nums[0]
        for i in range(1, len(nums)):
            single ^= nums[i]
        
        return single
            

        
