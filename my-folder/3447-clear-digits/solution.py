class Solution:
    def clearDigits(self, s: str) -> str:
        i=0
        while i<len(s):
            if s[i] in '0123456789':
                s=s[:i-1]+s[i+1:]
                i=max(0,i-1) #ca34 ->where i in 2 position we encountered digit so we remove i and i-1 position left with c4 now the i should reset to max(0,i-1) so i=1 now when we encounter a digit again 
            else:i+=1
        return s


        
