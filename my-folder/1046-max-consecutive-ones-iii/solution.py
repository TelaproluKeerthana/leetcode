class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        L, R = 0, 0
        longest_seq = 0
        count_zeros = 0
        while R < len(nums):
            if nums[R] == 0:
                count_zeros += 1
            
            while count_zeros > k:
                if nums[L] == 0:
                    count_zeros -= 1
                L += 1
            
            longest_seq = max(longest_seq, R-L + 1)
            R +=  1
        return longest_seq


            

        
