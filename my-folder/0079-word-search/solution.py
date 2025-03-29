class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        visit = set()
        def dfs(r, c, i):
            if i == len(word):
                return True
            
            if (r < 0 or c < 0 or r >= len(board) or c >= len(board[0]) or (r,c) in visit or word[i] != board[r][c]):
                return False

            visit.add((r,c))
            res = dfs(r + 1, c, i + 1) or dfs(r, c + 1, i + 1) or dfs(r - 1, c, i + 1) or dfs(r, c - 1, i + 1)
            visit.remove((r,c))
            return res
        
        for r in range(len(board)):
            for c in range(len(board[0])):
                if dfs(r, c, 0):
                    return True
        
        return False


# visit = (0,0), (0, 1) (0,2) (1, 2) 
# dfs(0, 0, 0)
# res = false or dfs(0, 1, 1) 
#                dfs(0, 2, 2) - dfs(1,2,3) - dfs()
                                        


                              
                                








    

        

        
