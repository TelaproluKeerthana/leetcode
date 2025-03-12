class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        rows = len(grid)
        cols = len(grid[0])

        #inplace sorting 
        for r in range(rows):
            for c in range(cols):
                if r == 0 and c == 0:
                    continue
                elif r == 0:
                    grid[r][c] += grid[r][c - 1]
                elif c == 0:
                    grid[r][c] += grid[r - 1][c]
                else:
                    grid[r][c] += min(grid[r-1][c], grid[r][c-1])
        return grid[rows-1][cols-1]

        # self.min_path_sum = float("inf")
        

        # def dfs(r,c,path_sum):
        #     if r >= rows or c >= cols:
        #         return 
            
        #     path_sum += grid[r][c]

        #     if( r == rows - 1 and c == cols - 1):
        #         self.min_path_sum = min(self.min_path_sum, path_sum)
        #         return 
        
        #     dfs(r + 1, c, path_sum)
        #     dfs(r, c + 1, path_sum)
            
        # dfs(0, 0, 0) 
        # return self.min_path_sum

# [1,3,1]
# [1,5,1]
# [4,2,1]  
