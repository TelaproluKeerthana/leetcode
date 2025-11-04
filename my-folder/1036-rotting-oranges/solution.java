class Solution {
    public int orangesRotting(int[][] grid) {
        int freshOrangeCount = 0;
        int totalTime = 0;
        Queue<int[]> que = new LinkedList<>();
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == 1){
                   freshOrangeCount++; 
                }
                else if(grid[r][c] == 2){
                    que.offer(new int[]{r, c});
                }
            }
        }

        int[][] directions = {{-1,0}, {0, -1}, {1, 0}, {0, 1}};
        while(freshOrangeCount > 0 && !que.isEmpty()){
            int size = que.size();
            for(int i = 0; i < size; i++){
                int[] curr = que.poll();
                for(int[] direction : directions){
                    int row = curr[0] + direction[0];
                    int col = curr[1] + direction[1];
                    if(row >= 0 && col >= 0 && col < grid[0].length && row < grid.length){
                        if(grid[row][col] == 1){
                            freshOrangeCount--;
                            grid[row][col] = 2;
                            que.offer(new int[]{row, col});
                        }
                    }
                }  
            }
            totalTime++;
        }

        if(freshOrangeCount != 0){
            return -1;
        }
        
        return totalTime;
    }
}
