class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        freqCounter=[1]*len(nums)
        for i in range(1,len(nums)):
            for j in range(i): 
                if nums[j] < nums[i]:
                    freqCounter[i] = max(1+freqCounter[j], freqCounter[i]) 
        print(freqCounter)
        return max(freqCounter)
                

                

        
