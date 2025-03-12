class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        #Two asteroids moving in the same direction will never meet.
        #If both are the same size, both will explode.
        #If two asteroids meet, the smaller one will explode. 
        stack = []
        ans = []
        for R in asteroids:
            if R > 0:
                stack.append(R)
            else:
                # elif stack and stack[-1] == abs(asteroids[R]):
                #     stack.pop()
                while stack and stack[-1] < abs(R):
                    stack.pop()
                    
                if len(stack) == 0:
                    ans.append(R)
                else:
                    if stack[-1] == abs(R):
                        stack.pop()
        ans += stack      
        return ans



