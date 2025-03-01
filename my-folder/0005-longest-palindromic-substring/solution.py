class Solution:
    def longestPalindrome(self, s: str) -> str:
        if(len(s)==1):
            return s
        l=0
        longest=0
        longest_ss=''
        for i in range(len(s)):
            #for odd cases when stringlen is 
            l=i
            r=i
            while(l>=0 and r<len(s) and s[l]==s[r]):
                if( r-l+1 > longest):
                    start_index=l
                    #start_index keeps tracks of from which position we saw the longest substring
                    longest=r-l+1
                l-=1
                r+=1
                
            

            # for even cases
            l=i
            r=i+1
            while(l>=0 and r<len(s) and s[l]==s[r]):
                if( r-l+1 > longest):
                    start_index=l
                    #start_index keeps tracks of from which position we saw the longest substring
                    longest=r-l+1
                l-=1
                r+=1
            
        return s[start_index:start_index+longest]
        




         
        



