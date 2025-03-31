class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        rows = len(heights)
        cols = len(heights[0])
        pacific = set()
        atlantic = set()

        def dfs(r, c, visit, prevHeight):
            if (r, c) in visit or r < 0 or c < 0 or r >= rows or c >= cols or heights[r][c] <  prevHeight:
                return

            visit.add((r, c))
            
            currHeight = heights[r][c]
            dfs(r + 1, c, visit, currHeight)
            dfs(r - 1, c, visit, currHeight)
            dfs(r, c + 1, visit, currHeight)
            dfs(r, c - 1, visit, currHeight)

        for col in range(cols):
            dfs(0, col, pacific, heights[0][col])
            dfs(rows - 1, col, atlantic, heights[rows - 1][col])
        
        for row in range(rows):
            dfs(row, 0, pacific, heights[row][0])
            dfs(row, cols - 1, atlantic, heights[row][cols - 1])
        res = []

        for r in range(rows):
            for c in range(cols):
                if (r,c) in pacific and (r,c) in atlantic:
                    res.append([r,c])
        return res

        
