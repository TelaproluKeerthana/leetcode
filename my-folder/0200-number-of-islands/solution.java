class Solution {
    public int numIslands(char[][] grid) {
      int islands = 0;
      for(int row = 0; row < grid.length; row++){
        for(int col = 0; col < grid[0].length; col++){
            if(grid[row][col] == '1'){
                islands++;
                dfs(grid, row, col);
            }
        }
      }


      return islands;  
    }

    private void dfs(char[][] grid, int row, int col){
        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0 || grid[row][col] != '1'){
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
