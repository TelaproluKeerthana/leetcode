class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        if len(candidates) == 1:
            return candidates if candidates[0] == target else []
        
        res = []
        
        def dfs(i, find, combinations):
            if find == target:
                res.append(combinations.copy())
                return

            if i >= len(candidates) or find > target:
                return 
            
            combinations.append(candidates[i])

            dfs(i, find + candidates[i], combinations)
            combinations.pop()
            dfs(i + 1, find, combinations)
        
        dfs(0, 0, [])
        return res





        
