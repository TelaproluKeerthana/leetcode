class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        cnt=0
        op=0
        for c in s:
            if c=='(':
                op+=1
            else:
                op-=1

            if(op<0):
                cnt+=1
                op=0
                
        res=op+cnt
        return res



        