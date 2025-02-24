class Solution:
    def mySqrt(self, x: int) -> int:
        if x<2:
            return x
        l=2
        r=x//2
        while(l<=r):
            pivot=l+(r-l)//2
            num=pivot*pivot
            if num>x:
                r=pivot-1
            elif num<x:
                l=pivot+1
            else:
                return pivot
        return r            


        
