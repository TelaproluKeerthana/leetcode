class Solution:
    
    def validPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1

        def is_palindrome(substring, l, r):
            while l < r:
                if s[l] != s[r]:
                    return False
                l += 1
                r -= 1
            return True
        
        while l < r:
            if s[l] == s[r]:
                l += 1
                r -= 1
            else:
                skip_left = is_palindrome(s, l + 1, r)
                skip_right = is_palindrome(s, l, r - 1)
                return skip_left or skip_right
        return True
                




