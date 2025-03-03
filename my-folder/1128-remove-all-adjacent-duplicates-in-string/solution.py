class Solution:
    def removeDuplicates(self, s: str) -> str:
        # stack = []
        # for i in s:
        #     if stack and stack[-1] == i:
        #         stack.pop()
        #     else:
        #         stack.append(i)
        # return "".join(stack)

        L = 0
        while L < len(s)-1:

            if s[L] == s[L + 1]:
                L -= 1
                s = s[: L+1] + s[L+3 :]
                if L < 0:
                    L = 0
            else:
                L += 1
        return s

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
