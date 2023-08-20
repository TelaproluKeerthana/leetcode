class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        for i in range(len(operations)):
            if operations[i]=='C':
                if len(operations)>0:
                    stack.pop()

            elif operations[i]=='D':
                if len(operations)>=1:
                    a=stack.pop()
                    stack.append(a)
                    stack.append(2*a)

            elif operations[i]=='+':
                if len(operations)>2:
                    a=stack.pop()
                    b=stack.pop()
                    stack.append(b)
                    stack.append(a)
                    stack.append(a+b)
            else:
                stack.append(int(operations[i]))
        sum=0
        for i in range(len(stack)):
            sum=sum+stack[i]
        return sum 

               




