class Solution:
    def maxWidthRamp(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        s = []
        ans = 0
        for i, num in enumerate(nums):
            if not s:
                s.append(i)
            else:
                if num < nums[s[-1]]:
                    s.append(i)
        for j in range(len(nums)-1,-1,-1):
            while s and nums[s[-1]] <= nums[j]:
                ans = max(ans, j - s.pop())
        return ans
