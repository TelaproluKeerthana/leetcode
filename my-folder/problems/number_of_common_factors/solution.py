class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        mini=min(a,b)
        sm=mini
        c=0
        for i in range(mini):
            if(a%sm==0 and b%sm==0):
                c+=1
            sm-=1
        
        return c


        