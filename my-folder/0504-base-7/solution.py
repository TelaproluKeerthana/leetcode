class Solution:
    def convertToBase7(self, num: int) -> str:
        if num==0:
            return '0'
        remainder=''
        #create a copy of original number incase of negative numbers
        original_num=num
        num=abs(num)
        while(num>0):
            remainder+=str(num%7)
            num=num//7
        if original_num<0:
            remainder+='-'
        return remainder[::-1]
        
