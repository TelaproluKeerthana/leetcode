class Solution:
    def rob(self, nums: List[int]) -> int:
    
        if len(nums) == 1:
            return nums[0]
        
        if len(nums) == 2:
            return max(nums)
        
        return max(self.robb(nums[1:]) , self.robb(nums[:-1]))

    def robb(self, arr):
        if  not arr:
            return 
        
        if len(arr) == 1:
            return arr[0]
        
        prev = arr[0]
        curr = max(arr[0], arr[1])
        for i in arr[2:]:
            temp = curr
            curr = max(i + prev, curr)
            prev = temp
        
        return curr
        









        
