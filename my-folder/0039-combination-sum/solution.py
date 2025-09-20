class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        res = []

        def dfs(idx, path, currSum):
            if(currSum == target):
                res.append(path[:])
                return 
            
            if(currSum > target or idx == len(candidates)):
                return 

            
            path.append(candidates[idx])
            dfs(idx, path, currSum + candidates[idx])
            path.pop()
            dfs(idx + 1, path, currSum)

        dfs(0, [], 0) 
        return res
