from collections import deque
class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        rows=len(grid)
        cols=len(grid[0])
        fresh=0
        time=0
        queue=Deque()
        directions=[[0,1],[1,0],[-1,0],[0,-1]]
        for r in range(rows):
            for c in range(cols):
                if(grid[r][c]==1):
                    fresh+=1
                if(grid[r][c]==2):
                    queue.append((r,c))
        while queue and fresh>0:
            length=len(queue)
            for i in range(length):
                r,c=queue.popleft()
                for rd,rc in directions:
                    row=rd+r
                    col=rc+c
                    if (row in range(len(grid))
                        and col in range(len(grid[0]))
                        and grid[row][col] == 1
                    ):
                        grid[row][col] = 2
                        queue.append((row, col))
                        fresh -= 1
            time += 1
        return time if fresh == 0 else -1


                


                 
        return self.total_time
        

# grid = [2,1,1]
#        [1,1,0]
#        [0,1,1]
        
