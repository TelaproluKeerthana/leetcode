class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        def dfs(op,cp, stack):
            if ( op == cp == n):
                res.append("".join(stack))
                return
            if ( op < n ):
                stack.append('(')
                dfs( op + 1, cp, stack)
                stack.pop()
            if ( cp < op):
                stack.append(')')
                dfs(op, cp + 1, stack)
                stack.pop()
        dfs(0,0, [])
        return res

            



        
