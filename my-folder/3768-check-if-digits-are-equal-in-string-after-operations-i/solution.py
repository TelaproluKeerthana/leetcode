class Solution:
    def hasSameDigits(self, s: str) -> bool:
        new_s=[int(i) for i in s]
        while(len(new_s)>2):
            new_s=[(new_s[i-1]+new_s[i])%10 for i in range(1,len(new_s))]
        return new_s[0]==new_s[1]


        
