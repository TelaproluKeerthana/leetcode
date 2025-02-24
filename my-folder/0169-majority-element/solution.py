import math
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        maj_elem,count=None,0
        for num in nums:
            if count==0:
                maj_elem=num
            count=count+(1 if num==maj_elem else -1)
        return maj_elem
        
