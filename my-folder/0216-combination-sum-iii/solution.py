class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:

        res = []
        def dfs(start, find, combo):
            if find ==  n and len(combo) == k:
                res.append(combo.copy())
                return 
            
            if find > n or len(combo) > k:
                return 
            
            for i in range(start, 10):
                dfs(i + 1, find + i, combo + [i])

        dfs(1, 0, [])
        return res

            

            


