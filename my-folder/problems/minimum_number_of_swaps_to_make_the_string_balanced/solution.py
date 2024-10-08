class Solution:
    def minSwaps(self, s: str) -> int:
        swap=0
        lilly=[]
        for c in s:
            if c=='[':
                lilly.append(c)
            else:
                if not lilly:
                    lilly.append(c)
                    swap+=1
                else:
                    lilly.pop()
        return swap

