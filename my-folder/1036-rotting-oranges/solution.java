class Solution {
    Queue<int[]> rottenOranges;
    public int orangesRotting(int[][] grid) {
        rottenOranges = new LinkedList<>();
        int freshOranges = 0;
        int totalTime = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 2){
                    rottenOranges.offer(new int[]{row, col});
                }
                else if(grid[row][col] == 1){
                    freshOranges += 1;
                }
            }
        }

        int[][] directions = {{-1, 0}, {1,0}, {0, 1}, {0, -1}};
        while(freshOranges > 0 && !rottenOranges.isEmpty()){
            int size = rottenOranges.size();
            for(int i = 0; i < size; i++){
                int[] curr = rottenOranges.poll();
                for(int[] direction : directions){
                    int row = curr[0] + direction[0];
                    int col = curr[1] + direction[1];
                    if(row >= 0 && col >= 0 && col < grid[0].length && row < grid.length){
                        if(grid[row][col] == 1){
                            freshOranges--;
                            grid[row][col] = 2;
                            rottenOranges.offer(new int[]{row, col});
                        }
                    }
                }  
            }
            totalTime++;
        }

        if(freshOranges != 0){
            return -1;
        }

        return totalTime;
    }
}
// total fresh oranges = 6
// what are rotten = 1



// [2,1,1]
// [1,1,0]
// [0,1,1]
