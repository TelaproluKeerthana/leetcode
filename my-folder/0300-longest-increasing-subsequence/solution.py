class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        freqCounter=[1]*len(nums)
        for i in range(len(nums)-1,-1,-1):
            for j in range(i+1, len(nums)): 
                if nums[i] < nums[j]:
                    freqCounter[i] = max(1+freqCounter[j], freqCounter[i]) 
        return max(freqCounter)
                

                

        
