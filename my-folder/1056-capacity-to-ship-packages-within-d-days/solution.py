class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        def canShip(cap):
            ships, currcap = 1, cap
            for w in weights:
                if currcap - w < 0:
                    ships += 1
                    currcap = cap
                currcap -= w

            return ships <= days


        low = max(weights)
        high = sum(weights)
        res = high
        while low <= high:
            mid = (low + high) // 2
            if canShip(mid):
                res = min(res, mid)
                high = mid - 1
            else:
                low = mid + 1
        
        return res
    
        









        
        

            



        
