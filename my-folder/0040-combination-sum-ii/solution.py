class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        candidates.sort()
        def dfs(i, find, combo):
            if find == target:
                res.append(combo.copy())
                return 
            
            if find > target or i == len(candidates):
                return 

            combo.append(candidates[i])
            dfs(i + 1, find + candidates[i], combo)
            combo.pop()
            while i + 1 < len(candidates) and candidates[i] == candidates[i + 1]:
                i += 1
            dfs(i + 1, find, combo)

        dfs(0, 0, [])
        return res


        
