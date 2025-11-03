class Solution {
    public int numIslands(char[][] grid) {
        int totalIslands = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == '1'){
                    totalIslands++;
                    dfs(grid, r, c);
                }
            }
        }

        return totalIslands;
    }

    private void dfs(char[][] grid, int row, int col){
        if(row < 0 || row >= grid.length || col < 0  || col >= grid[0].length || grid[row][col] != '1'){
            return;
        }

        grid[row][col] = '0';

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}

//   ["1","1","1","1","0"]
//   ["1","1","0","1","0"]
//   ["1","1","0","0","0"]
//   ["0","0","0","0","0"]

//   check 4 directions
//   if any of it is land then iterate four directions check all lands that can be reached from that point and return 

//   mark as visited so you dont visit them again 

