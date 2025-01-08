class Solution(object):
    def generateParenthesis(self, n):
        stack=[] #stack to add the paranthesis and update res
        res=[] #to store all possible solutions
        def backtrack(openN,closeN):
            if openN==closeN==n:
                res.append("".join(stack))
                return 
            if openN<n:
                stack.append("(")
                backtrack(openN+1,closeN)
                stack.pop()
            if closeN<openN:
                stack.append(")")
                backtrack(openN,closeN+1)
                print(stack)
                stack.pop()
        backtrack(0,0)
        return res
        
