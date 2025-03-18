class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        def dfs(i, subs, res):
            if i == len(nums):
                res.append(subs.copy())
                return 
            subs.append(nums[i])
            dfs(i + 1, subs, res)
            subs.pop()
            dfs(i + 1, subs, res)
        
        dfs(0, [], res)
        return res

        
