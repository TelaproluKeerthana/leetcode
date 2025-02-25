class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        # if len(str1)==len(str2)==1:
        #     return str1[0] if str1[0]==str2[0] else ""
        # pre=""
        # for i in range(len(str2)):
        #     if str1[i]==str2[i]:
        #         pre+=str1[i]
        if str1+str2 != str2+str1:
            return ""
        gcd_length=gcd(len(str1),len(str2))
        return str1[:gcd_length]
                


        
