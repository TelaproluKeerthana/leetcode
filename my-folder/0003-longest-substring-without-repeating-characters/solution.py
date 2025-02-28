class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)<=1:
            return len(s)
        window=set()
        L=0
        max_len=0
        for R in range(len(s)):
            while s[R] in window:
                window.remove(s[L])
                L+=1
            window.add(s[R])
            max_len=max(max_len,R-L+1)
        return max_len


        
