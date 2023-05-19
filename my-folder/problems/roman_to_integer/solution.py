class Solution:
    def romanToInt(self, s: str) -> int:
        sum=0
        s=s.replace('IV','IIII').replace('IX','VIIII')
        s=s.replace('XL','XXXX').replace('XC','LXXXX')
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC")
        for i in range(len(s)):
            if s[i]=='I':
                sum=sum+1
            elif s[i]=='V':
                sum=sum+5
            elif s[i]=='X':
                sum=sum+10
            elif s[i]=='L':
                sum=sum+50
            elif s[i]=='C':
                sum=sum+100
            elif s[i]=='D':
                sum=sum+500
            elif s[i]=='M':
                sum=sum+1000
        return sum        