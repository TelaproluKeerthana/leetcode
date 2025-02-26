class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if not s and not t:
            return True
        if len(s)==0:
            return True
        if len(s)>len(t):
            return False
        s_iter=0
        for R in range(len(t)):
            if s[s_iter]==t[R]:
                s_iter+=1
                if(s_iter==len(s)):
                    return True
        return False
        
