class Solution:
    def isPalindrome(self, x: int) -> bool:
        k=str(x)
        rev_x=k[::-1]
        if(k==rev_x):
            return True
        else:
            return False


           
        