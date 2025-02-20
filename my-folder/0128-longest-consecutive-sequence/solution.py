class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        numset=set(nums)
        maxcount=0
        for i in numset:
            if i-1 not in numset:
                count=1
                while(i+count in numset):
                    # temp in numset:
                    count+=1  
                maxcount=max(count,maxcount)
        return maxcount

# [100,4,200,1,3,2]
#            i 
# count=3


