import math
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        freq=Counter(nums)
        need=math.floor(len(nums)/2)
        for key,val in freq.items():
            if val>need:
                return key
        
