class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 1:
            return nums[0]
        prev = nums
        while n > 1:
            curr = [0] * (n - 1)
            for i in range(1, len(prev)):
                curr[i - 1] = (prev[i] + prev[i - 1]) % 10
            prev = curr
            n -= 1
        return curr[0]

        
