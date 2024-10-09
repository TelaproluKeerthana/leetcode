class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[]
        subset=[]
        def subsubs(i):
            if i>=len(nums):
                res.append(subset.copy())
                return 
            subset.append(nums[i])
            subsubs(i+1)
            subset.pop()
            subsubs(i+1)
        subsubs(0)
        return res      
