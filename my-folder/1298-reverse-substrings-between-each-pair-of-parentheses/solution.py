class Solution:
    def reverseParentheses(self, s: str) -> str:
        stack = []
        
        for char in s:
            if char == ")":
                output = []
                while stack and stack[-1] != '(':
                    output.append(stack.pop())
                stack.pop()
                stack.extend(output)
            else:
                stack.append(char)
        
        
        return "".join(stack)


        

            
                
            


        
