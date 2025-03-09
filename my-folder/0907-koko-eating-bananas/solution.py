class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l = 1
        r = max(piles)
        min_eat = float("inf")
        while (l <= r):
            mid_k = (l + r) // 2
            hours = 0
            for p in piles:
                hours += math.ceil(p/mid_k)
            if (hours > h):
                l = mid_k + 1
            else:
                min_eat = min(mid_k, min_eat)
                r = mid_k - 1
        
        return min_eat

# [3,6,7,11]
#  l = 1 
