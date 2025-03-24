class Solution:
    @lru_cache(maxsize = None)
    def hammingWeight(self, n: int) -> int:
        count = 0
        while n:
            n = n & (n - 1)
            count += 1
        
        return count


        
