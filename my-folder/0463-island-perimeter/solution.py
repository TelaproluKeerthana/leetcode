class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        perimeter=0
        # visit=set()
        rows=len(grid)
        cols=len(grid[0])
        # def dfs(r,c):
        #     if(r<0 or c<0 or r>=rows or c>=cols or grid[r][c]==0):
        #             return 1
        #     if ((r,c) in visit):
        #         return 0
        #     visit.add((r,c))
        #     self.perimeter=dfs(r+1,c)
        #     self.perimeter+=dfs(r-1,c)
        #     self.perimeter+=dfs(r,c+1)
        #     self.perimeter+=dfs(r,c-1)
        #     return self.perimeter
        
        # for r in range(rows):
        #     for c in range(cols):
        #         if grid[r][c]==1:
        #             return dfs(r,c)
        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == 1:
                    perimeter += 4
                    if i > 0 and grid[i-1][j] == 1:
                        perimeter -= 2
                    if j > 0 and grid[i][j-1] == 1:
                        perimeter -= 2
        return perimeter            

        
