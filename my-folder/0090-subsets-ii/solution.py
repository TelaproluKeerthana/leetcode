class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums.sort()
        def subset(i,subs,res):
            if(i>=len(nums)):
                res.append(subs.copy())
                return
            subs.append(nums[i])
            subset(i+1,subs,res)
            subs.pop()
            while(i+1<len(nums) and nums[i]==nums[i+1]):
                i+=1
            subset(i+1,subs,res)
        subset(0,[],res)
        return res
        


        
