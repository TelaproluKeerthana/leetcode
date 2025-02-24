class Solution:
    def isPalindrome(self, x: int) -> bool:
        l=0
        xstr=str(x)
        r=len(xstr)-1
        while l<=r:
            if xstr[l]!=xstr[r]:
                return False
            l+=1
            r-=1
        return True
            


           
        
