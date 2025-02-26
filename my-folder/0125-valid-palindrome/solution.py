class Solution:
    def isPalindrome(self, s: str) -> bool:
        for c in string.punctuation:
            s=s.replace(c,"")
        s=s.replace(" ","").lower()
        return s==s[::-1]
