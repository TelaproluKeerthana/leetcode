class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        # use a stack to store the digits when a operator comes do the operation and push result into the stack
        stack = []
        operators = set(["+", "-", "*", "/"])
        for token in tokens:
            if token not in operators:
                stack.append(int(token))
            else:
                if len(stack) >= 2:
                    digit2 = stack.pop()
                    digit1 = stack.pop()
                    print(digit1, digit2)
                    if token == "+":
                        stack.append(digit1 + digit2)
                    elif token == "-":
                        stack.append(digit1 - digit2)
                    elif token == "*":
                        stack.append(digit1 * digit2)
                    elif token == "/":
                        stack.append(int(float(digit1) / digit2))
        return stack[-1]

