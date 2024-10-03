class Solution:
    def minSubarray(self, nums: List[int], p: int) -> int:
        sum1=0
        sum2=0
        totalSum=0
        subSum=[]
        remainder=(sum(nums)%p)
        if(remainder==0):
            return 0
        length=len(nums)
        res=length
        minPrefix={0:-1}
        prefSum=0
        for i in range(length):
            prefSum+=nums[i]
            r=(prefSum)%p
            required=(r-remainder+p)%p
            if required in minPrefix:
                res=min(res,i-minPrefix[required])
            minPrefix[r]=i
        
        return res if res!=length else -1

        return -1

            


        