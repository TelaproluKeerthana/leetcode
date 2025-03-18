class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        def dfs(i, subs):
            if i == len(nums):
                res.append(subs.copy())
                return 
            subs.append(nums[i])
            dfs(i + 1, subs)
            subs.pop()
            dfs(i + 1, subs)
        
        dfs(0, [])
        return res

        
