class MinStack:

    def __init__(self):
        self.stack=[]
        

    def push(self, val: int) -> None:
        self.stack.append(val)
        

    def pop(self) -> None:
        if not self.stack:
            raise Exception("Stack is empty")
        else:
            self.stack.pop()
        

    def top(self) -> int:
        if not self.stack:
            raise Exception("Stack is empty")
        else:
            return self.stack[-1]
        

    def getMin(self) -> int:
        if not self.stack:
            raise Exception("stack is empty")
        else:  
            smallest=self.stack[0]   
            for i in range(1,len(self.stack)):
                if(self.stack[i]<smallest):
                    smallest=self.stack[i]
            return smallest
            
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()