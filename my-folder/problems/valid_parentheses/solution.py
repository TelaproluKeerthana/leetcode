class Solution:
    def isValid(self, s: str) -> bool:
        has={'(':')','{':'}','[':']'}
        stack=[]
        for i in s:
            if i in has:
                stack.append(i)
            elif(len(stack)==0 or i!=has[stack.pop()]):
                return False
        return (len(stack)==0)
        