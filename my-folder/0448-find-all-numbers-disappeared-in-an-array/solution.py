class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        maxi = len(nums)
        for num in nums:
            idx = abs(num) - 1
            if nums[idx] > 0:
                nums[idx] = -nums[idx]
        return [i + 1 for i in range(maxi) if nums[i] > 0]



        
