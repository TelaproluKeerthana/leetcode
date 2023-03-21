class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        r=0
        for k in range(1, len(nums)):
            if nums[k]!=nums[r]:
                r+= 1
                nums[r]=nums[k]
        return r + 1





