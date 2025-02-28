class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxlen=0
        for i in range(len(s)):
            window=set()
            for j in range(i,len(s)):
                if s[j] in window:
                    break
                window.add(s[j])
            maxlen=max(len(window),maxlen)
        return maxlen


        #optimised
        # if len(s)<=1:
        #     return len(s)
        # window=set()
        # L=0
        # max_len=0
        # for R in range(len(s)):
        #     while s[R] in window:
        #         window.remove(s[L])
        #         L+=1
        #     window.add(s[R])
        #     max_len=max(max_len,R-L+1)
        # return max_len


        
