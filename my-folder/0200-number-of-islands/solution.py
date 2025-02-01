class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        total_islands=0
        rows=len(grid)
        cols=len(grid[0])
        def dfs(r,c):
            if(min(r,c)<0 or r>=rows or c>=cols or grid[r][c]=="0"):
                return 
            #mark the visited node with 0 so you dont go there in next iteration
            grid[r][c]="0"
            dfs(r+1,c)
            dfs(r-1,c)
            dfs(r,c+1)
            dfs(r,c-1)
        for r in range(rows):
            for c in range(cols):
                if(grid[r][c]=="1"):
                    dfs(r,c)
                    total_islands+=1

        return total_islands

        
