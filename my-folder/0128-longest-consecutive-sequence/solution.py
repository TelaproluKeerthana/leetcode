class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums = set(nums)
        max_len = 0
    
        for num in nums:
            if num - 1 not in nums:
                c = 0
                while(c + num in nums):
                    c += 1
                    max_len = max(max_len, c)
        
        return max_len

        
