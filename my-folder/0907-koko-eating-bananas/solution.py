class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l,r = 1,max(piles)
        minK=max(piles)
        while(l<=r):
            hours=0
            k=(l+r)//2
            for p in piles:
                hour= math.ceil(p/k)
                hours+=hour
            if(hours>h):
                l=k+1
            else:
                minK=min(k,minK)
                r=k-1
        
        return minK


        

        



        
