class Solution:
    def jump(self, nums: List[int]) -> int:
        l = 0
        r = 0
        total_steps = 0
        while(r < len(nums) - 1):
            maxtravel = 0
            for level in range(l, r + 1):
                maxtravel = max( level + nums[level], maxtravel )

            l = r + 1
            r = maxtravel
            total_steps += 1

        return total_steps
    

        
