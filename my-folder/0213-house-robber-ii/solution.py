class Solution:
    def rob(self, nums: List[int]) -> int:
    
        if len(nums) == 1:
            return nums[0]
        
        if len(nums) == 2:
            return max(nums)
        
        return max(self.robb(nums[1:]) , self.robb(nums[:-1]))

    def robb(self, arr):
        prev = 0 
        curr = 0
        for i in arr:
            temp = curr
            curr = max(curr, i + prev)
            prev = temp
    
        return curr







        
