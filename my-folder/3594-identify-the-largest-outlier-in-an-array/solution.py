class Solution:
    def getLargestOutlier(self, nums: List[int]) -> int:
        total = sum(nums)
        count = Counter(nums)
        result = -1001

        for num in nums:
            # in case the potential_sum == num
            count[num] -= 1
            # remaining sum
            curr_sum = total - num
            # test if this number can be a outlier
            potential_sum = curr_sum / 2
            if potential_sum in count and count[potential_sum] > 0:
                result = max(result, num)
            count[num] += 1       
        return result
        
