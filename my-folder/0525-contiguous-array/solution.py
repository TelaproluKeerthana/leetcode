class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        #keep track of no of zeros and ones at every index
        zeros = ones = 0
        count_diff = {}
        res = 0
        for idx, val in enumerate(nums):
            if val == 0:
                zeros += 1
            else:
                ones += 1
            
            #keep track of ones and zeros at each position
            if ones - zeros not in count_diff:
                count_diff[ones - zeros] = idx
            
            if ones == zeros:
                res = ones + zeros
            else:
                index = count_diff[ones - zeros]
                res = max(idx - index, res)

        return res
            

         
