class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)==0:
            return 0
        if len(s)==1:
            return 1
        maxwindowlen=0
        window=set()
        L=0
        for R in range(len(s)):
            while s[R] in window:
                window.remove(s[L])
                L+=1
            window.add(s[R])
            maxwindowlen=max(maxwindowlen,R-L+1)
        return maxwindowlen
        
# window=set()
# window=abc
# s="abcabcbb"
#      r 
# wind=abc

# maxwindowlength=3
        
