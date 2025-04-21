class Solution:
    def findGCD(self, nums: List[int]) -> int:
        
        low = min(nums)
        high = max(nums)
        
        if high % low == 0:
            return low

        dummy = low
        
        while dummy > 1:
            if high % dummy == 0 and low % dummy == 0:
                return dummy
            dummy -= 1
        
        return 1
        

         
        
