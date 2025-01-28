class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rows=len(board)
        cols=len(board[0])
        path=set()
        def dfs(r,c,i):
            #if we didn't return false until the length of the word and we moved to next element then we obviously found the element
            if(i==len(word)):
                return True
            # if r and c dont go out of bounds and the path is not yet covered and the word is not equal
            if r>=rows or c>=cols or c<0 or r<0 or board[r][c]!=word[i] or (r,c) in path:
                return False
            #as we move in a path append the path direction to the path
            path.add((r,c)) 
            #if we found a path from any of those recursive calls we return true or false
            res=(dfs(r+1,c,i+1) or dfs(r-1,c,i+1) or dfs(r,c-1,i+1) or dfs(r,c+1,i+1))
            path.remove((r,c))
            return res
        for r in range(rows):
            for c in range(cols):
                if dfs(r,c,0):
                    return True
        return False



        
