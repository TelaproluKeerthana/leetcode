class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        l = 0
        maxlen = 0
        for r in range(len(nums)):
            if nums[r] == 0:
                maxlen = max(r - l, maxlen)
                l = r + 1

        return max(maxlen, len(nums) - l)


        
