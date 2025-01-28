class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res=[]
        def helper(i,s,res):
            if(i>=len(nums)):
                res.append(s[:])
                return
            s.append(nums[i])
            helper(i+1,s,res)
            s.pop()
            helper(i+1,s,res)
        helper(0,[],res)
        return res
        

        
