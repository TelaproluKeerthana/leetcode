class Solution:
    def isPalindrome(self, s: str) -> bool:
        newstr=''
        for i in s:
            if i.isalnum():
                newstr+=i

        return (newstr.lower()==newstr[::-1].lower())
            


        