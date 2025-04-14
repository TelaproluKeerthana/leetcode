class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        L = len(num1) - 1
        R = len(num2) - 1
        new_num = []
        carry = 0
        while L >= 0 or R >= 0:
            digit1 = int(num1[L]) if L >= 0 else 0
            digit2 = int(num2[R]) if R >= 0 else 0 
            num = carry + digit1 + digit2
            carry = num // 10
            new_num.append(str(num % 10))
            L -= 1
            R -= 1
        
        if carry:
            new_num.append(str(carry))

        new_num.reverse()
        return "".join(new_num)

        






        
