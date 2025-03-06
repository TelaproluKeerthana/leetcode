class Solution:
    def getLargestOutlier(self, nums: List[int]) -> int:
        total = sum(nums)
        
        count = Counter(nums)
        result = float("-inf")

        for num in nums:
            # in case the potential_sum == num
            count[num] -= 1

            # remaining sum
            total -= num
            # test if this number can be a outlier
            if total%2==0 and count[total//2] > 0:
                result = max(result, num)
            count[num] += 1
            total += num       
        return result
        
