class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        total_subarrays = 0
        if k <= 1:
            return total_subarrays
        product = 1
        L = 0
        for R in range(len(nums)):
            product *= nums[R]

            while product >= k:
                product //= nums[L]
                L += 1
            total_subarrays += R - L + 1

        return total_subarrays
