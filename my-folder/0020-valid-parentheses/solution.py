class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) == 1:
            return False
        hm = { "}" : "{", "]" : "[", ")" : "("}
        stack = [s[0]]
        for char in s[1: ]:
            if char in '}])' and  stack and stack[-1] == hm[char]:
                stack.pop()
            elif char in '}])' and stack and stack[-1] != hm[char]:
                return False
            else:
                stack.append(char)

        return True if not stack else False

        
