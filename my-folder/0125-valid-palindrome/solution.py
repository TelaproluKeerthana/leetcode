class Solution:
    def isPalindrome(self, s: str) -> bool:
        lower_string = s.lower()
        L=0
        R=len(s)-1
        while(L<R):
            if lower_string[L].isalnum() and lower_string[R].isalnum():
                if lower_string[L]!=lower_string[R]:
                    return False
                L+=1
                R-=1
            if not lower_string[L].isalnum():
                L+=1
            if not lower_string[R].isalnum():
                R-=1
        return True



        
