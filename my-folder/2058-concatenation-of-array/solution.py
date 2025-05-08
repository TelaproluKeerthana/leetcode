class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        nums_length = len(nums)
        ans = [0] * (nums_length * 2)
        
        for i in range(nums_length):
            ans[i] = nums[i]
            ans[nums_length + i] = nums[i]
        
        return ans

        
