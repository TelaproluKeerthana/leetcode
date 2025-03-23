class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0: 
            return 0
        if n == 1:
            return nums[0]
        prev = nums
        while n > 1:
            cur = [0] * (n - 1)
            for i in range(1, len(prev)):
                cur[i - 1] = (prev[i] + prev[i - 1]) % 10
            prev = cur
            n -= 1
        return cur[n // 2]

