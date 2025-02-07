class Solution:
    def longestPalindrome(self, s: str) -> str:
        stringStart=0
        reslen=0
        
        for i in range(len(s)):
            #for odd cases
            l,r=i,i
            while l>=0 and r<len(s) and s[l]==s[r]:
                if (r-l+1>reslen):
                    stringStart = l
                    reslen = r-l+1
                l-=1
                r+=1
            #for even cases
            l=i
            r=i+1
            while l>=0 and r<len(s) and s[l]==s[r]:
                if (r-l+1>reslen):
                    stringStart = l
                    reslen = r-l+1
                l-=1
                r+=1
        return s[stringStart:stringStart+reslen]

            



        
