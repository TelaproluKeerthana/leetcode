class Solution:
    def longestArithSeqLength(self, nums: List[int]) -> int:
        num_range = max(nums) - min(nums)
        res = max(Counter(nums).values())
        for abs_delta in range(1, num_range + 1):
            if num_range // abs_delta + 1 <= res:
                break
            for delta in (-abs_delta, abs_delta):
                lookup = {}
                for num in nums:
                    prev = num - delta
                    lookup[num] = lookup.get(prev, 0) + 1
                    res = max(res, lookup[num])
        return res

                





        

