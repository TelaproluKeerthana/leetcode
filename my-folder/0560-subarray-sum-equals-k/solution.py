class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hm = {0 : 1}
        res = 0
        curr_sum = 0
        for n in nums:
            curr_sum = curr_sum + n
            diff = curr_sum - k
            res += hm.get(diff,0)
            hm[curr_sum] = 1 + hm.get(curr_sum,0)
        return res

# nums = [1, 1, 1]
#         i
#            j

        
