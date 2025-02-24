class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        l=0
        r=0
        n=len(nums)
        maxlen=0
        while r<n:
            if(nums[r]==1):
                r+=1
            else:
                maxlen=max(r-l,maxlen)
                r+=1
                l=r
        maxlen=max(maxlen,r-l)  
        return maxlen


        
