class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        j=len(nums)
        res=[0]*j
        prefix=[0]*j
        suffix=[0]*j
        prefix[0]=1
        suffix[j-1]=1
        for i in range(1,j):
            prefix[i]=nums[i-1]*prefix[i-1]
        print(prefix)
        for i in range(j-2,-1,-1):
            suffix[i]=nums[i+1]*suffix[i+1]
        print(suffix)
        for i in range(len(nums)):
            res[i]=suffix[i]*prefix[i]
        return res
