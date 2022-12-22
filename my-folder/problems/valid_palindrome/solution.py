class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1 = (''.join(c for c in s if c.isalnum())).lower()
        return s1==s1[::-1]
            