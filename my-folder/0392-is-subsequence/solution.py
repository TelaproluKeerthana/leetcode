class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        lmax=len(s)
        R=L=0
        if len(s)==0:
            return True
        if len(s)>len(t):
            return False
        while R<len(t):
            if(t[R]==s[L]):
                L+=1
                if L==lmax:
                    return True
            R+=1
        return L==lmax
        
