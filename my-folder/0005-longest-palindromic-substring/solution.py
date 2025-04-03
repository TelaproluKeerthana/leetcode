class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) == 1:
            return s
        
        start_pos = 0
        longest = 0
        for i in range(len(s)):
            l = i
            r = i
            while(l >= 0 and r < len(s) and s[l] == s[r]):
                if(r - l + 1 > longest):
                    start_pos = l
                    longest = r - l + 1 

                l -= 1
                r += 1
            
            l = i
            r = i + 1
            while(l >= 0 and r < len(s) and s[l] == s[r]):
                if(r - l + 1 > longest):
                    start_pos = l
                    longest = r - l + 1
                
                l -= 1
                r += 1
            
        return s[start_pos:start_pos + longest]


                



        

        
        
        
