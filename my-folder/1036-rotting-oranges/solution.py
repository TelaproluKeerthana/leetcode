class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        que = deque()
        fresh = 0
        rows = len(grid)
        cols = len(grid[0])
        total_time=0 

        for r in range(rows):
            for c in range(cols):
                if(grid[r][c] == 2):
                    que.append((r,c))
                elif(grid[r][c] == 1):
                    fresh += 1

        directions = [[1,0], [-1,0], [0,1], [0,-1]]

        while fresh  > 0 and que :
            
            for _ in range(len(que)):
                r,c = que.popleft()
                for rd, cd in directions:
                    r_idx = r + rd
                    c_idx = c + cd
                    if  r_idx < rows and 0 <= r_idx and  0 <= c_idx and c_idx < cols:
                        if(grid[r_idx][c_idx] == 1):
                            fresh -= 1
                            grid[r_idx][c_idx] = 2
                            que.append((r_idx, c_idx))
            
            total_time += 1
        
        if fresh != 0:
            return -1
        
        return total_time

# fresh=2-1-1
# time=1+1+1+1


                

                    





        
