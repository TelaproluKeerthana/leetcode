class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == 1){
                    maxArea = Math.max(maxArea, dfs(grid, r, c));
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != 1){
            return 0;
        }
        
        grid[row][col] = 0;

        return (1 + 
        dfs(grid, row + 1, col) +
        dfs(grid, row - 1, col) +
        dfs(grid, row, col + 1) +
        dfs(grid, row, col - 1));
    }
}
