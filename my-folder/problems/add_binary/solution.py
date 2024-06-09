class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a1=len(a)
        b1=len(b)
        a=a[::-1]
        b=b[::-1]
        res=""
        carry=0
        for i in range(max(a1,b1)):
            a11=ord(a[i])-ord('0') if(i<a1) else 0
            b11=ord(b[i])-ord('0') if(i<b1) else 0
            digit=a11+b11+carry
            char=str(digit%2)
            res=char+res
            carry=digit//2
        if carry:
            res="1"+res
        return res


        