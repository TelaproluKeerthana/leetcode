class Solution {
    public int countBattleships(char[][] board) {
        int totalShips = 0;
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] == 'X'){
                    totalShips++;
                    dfs(board, r, c);
                    
                }
            }
        }

        return totalShips;
    }

    private void dfs(char[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board[0].length && board[row][col] == 'X'){
            board[row][col] = '.';
            dfs(board, row + 1, col);
            dfs(board, row - 1, col);
            dfs(board, row, col + 1);
            dfs(board, row, col - 1);
        }
    }
}
