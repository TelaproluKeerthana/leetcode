class Solution {
    public void solve(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for(int row = 0; row  < rows; row++){
            dfs(row, 0, grid);
            dfs(row, cols - 1, grid);
        }

        for(int col = 0; col  < cols; col++){
            dfs(0, col, grid);
            dfs(rows - 1, col, grid);
        }

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(grid[row][col] == 'O'){
                    grid[row][col] = 'X';
                }
                else if(grid[row][col] == 'U'){
                    grid[row][col] = 'O';
                }
            }
        }
        
    }

    public void dfs(int r, int c, char[][] board){
        int rows = board.length;
        int cols = board[0].length;
        if(r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != 'O'){
            return;
        }

        board[r][c] = 'U';
        
        dfs(r + 1, c, board);
        dfs(r - 1, c, board);
        dfs(r, c + 1, board);
        dfs(r, c - 1, board);
    }
}


// if you have o's at 0 row/col or n - 1 row/col dont consider to update them. 
//  then check where ever you have o's and try to capture them but updating index value

