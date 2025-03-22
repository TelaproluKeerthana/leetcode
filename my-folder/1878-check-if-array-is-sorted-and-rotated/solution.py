class Solution:
    def check(self, nums: List[int]) -> bool:
        # find minimum
        # from min - end and start - min -1 will be equal to sorted array
        prev = nums[0]
        min_idx = 0
        for i, curr in enumerate(nums):
            if(prev > curr):
                min_idx = i
            prev = curr
        
        if min_idx > 0:
            return nums[min_idx: ] + nums[0 : min_idx] == sorted(nums)
        
        return nums == sorted(nums)

# 3,4,5,1,2
# min = 1
# index(1) = 3
# return [3:] + [0:2] == sorted(nums)

        
