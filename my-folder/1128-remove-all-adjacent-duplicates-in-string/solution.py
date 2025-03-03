class Solution:
    def removeDuplicates(self, s: str) -> str:
        stack = []
        for i in s:
            if stack and stack[-1] == i:
                stack.pop()
            else:
                stack.append(i)
        return "".join(stack)

        # L = 0
        # R = 1
        # while R < len(s):

        #     if s[L] != s[R]:
        #         L += 1

        #     elif s[L] == s[R]:

        #         s = s[ : L] + s[R+1: ]
        #         # s.replace(s[L : R+1], "")
        #         if L-1 >= 0:
        #             L -=  1
        #         else: 
        #             L = 0
        #         R = L + 1 
        #     else:
        #         R += 1
        # return s
        
# s =  a b b a c a "
#        L
#          R
