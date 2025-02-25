class Solution:
    def clearDigits(self, s: str) -> str:
        stack=[]
        for i in s:
            if i in '0123456789' and len(stack)!=0:
                stack.pop()
            else: stack.append(i)
        return "".join(stack)


        
