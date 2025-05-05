class Solution:
    def nextGreaterElement(self, n: int) -> int:
        digits = list(str(n)) 
        i = len(digits) - 2
    
        # finding the first digit greater digit from right
        while i >= 0 and digits[i] >= digits[i + 1]:
            i -= 1

        if i == -1:
            return -1

        # find next larger element 
        j = len(digits) - 1

        # find next larger element next to the digit
        while digits[j] <= digits[i]:
            j -= 1

        digits[i], digits[j] = digits[j], digits[i]
        digits[i + 1:] = reversed(digits[i + 1:])

        result = int(''.join(digits))
        return result if result < (2 ** 31) else -1
        

        


        
