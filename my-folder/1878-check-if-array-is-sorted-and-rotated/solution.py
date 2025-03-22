class Solution:
    def check(self, nums: List[int]) -> bool:
        # find minimum
        # from min - end and start - min -1 will be equal to sorted array
        prev = nums[0]
        min_idx = 0
        for i, curr in enumerate(nums):
            if(prev > curr):
                min_idx = i
                break
            prev = curr
        # nums[min_idx: ] + nums[0 : min_idx]
        initial_pos = min_idx
        while ((min_idx + 1) % len(nums) != initial_pos):
            curr = nums[min_idx]
            nxt = nums[(min_idx + 1) % len(nums)]
            if curr > nxt:
                return False
            min_idx = (min_idx + 1) % len(nums)
        
        return True

# min_idx = 1
# 2 != 1
# 0 + 1 != 1
# [2, 1, 3, 4]
#        
   
        
