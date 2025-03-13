class Solution:
    def findMin(self, nums: List[int]) -> int:
        l = 0 
        r = len(nums) - 1
        mini = nums[0]
        while l < r:
            mid = (l + r) // 2
            mini = min(nums[mid], mini)
            if nums[mid] > nums[r]:
                l = mid + 1
            else:
                r = mid
        return min(mini, nums[l])

                
            
