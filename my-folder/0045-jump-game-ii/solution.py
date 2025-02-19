class Solution:
    def jump(self, nums: List[int]) -> int:
        l,r=0,0
        res=0 #to track the total number of steps we make
        while(r<len(nums)-1):
            #keep track of the max element in that level
            maxtravel=0
            for i in range(l,r+1):
                maxtravel=max(maxtravel,i+nums[i])
            l=r+1
            r=maxtravel
            res+=1

        return res
        
