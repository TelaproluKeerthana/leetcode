class Solution:
    def reverseVowels(self, s: str) -> str:
        L=0
        R=len(s)-1
        vowels='aeiouAEIOU'
        s=list(s)
        if(len(s)==1):
            return "".join(s)
        while(L<R):
            if s[L] not in vowels:
                L+=1
            elif s[R] not in vowels:
                R-=1
            else:
                s[L],s[R]=s[R],s[L]
                L+=1
                R-=1
        return "".join(s)
            

        
