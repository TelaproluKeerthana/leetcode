class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        left=0
        maxlen=0
        for right in range(len(nums)):
            if(nums[right]==0):
                maxlen=max(right-left,maxlen)
                left=right+1 
        return max(maxlen,len(nums)-left)


        
