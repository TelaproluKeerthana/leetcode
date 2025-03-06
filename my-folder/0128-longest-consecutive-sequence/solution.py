class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hashset = set(nums)
        max_count = 0
        for num in hashset:
            if (num - 1 not in hashset):
                c = 0
                while num + c in hashset:
                    c += 1
                    max_count = max(c, max_count)
        return max_count
        
