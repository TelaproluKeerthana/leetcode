class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack=[]
        for i in range(len(operations)):
            if operations[i]=='C':
                if  len(operations)>1:
                    stack.pop()
            elif operations[i]=='D':
                if len(operations)>=1:
                    a=stack.pop()
                    stack.append(a)
                    stack.append(a*2)
            elif operations[i]=='+':
                if len(operations)>2:
                    a=stack.pop()
                    b=stack.pop()
                    stack.append(b)
                    stack.append(a)
                    stack.append(a+b)
            else:
                stack.append(int(operations[i]))
        
        return sum(stack)
        
            

        