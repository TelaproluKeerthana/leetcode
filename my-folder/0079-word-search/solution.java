class Solution {
    public boolean exist(char[][] board, String word) {
        for(int m = 0; m < board.length; m++){
            for(int n = 0; n < board[0].length; n++){
                if(board[m][n] == word.charAt(0) && dfs(m, n, 0, word, board)){
                    return true;
                }
                }
            }

            return false;
        }
    

    private boolean dfs(int row, int col, int idx, String word, char[][] board){
        if(idx == word.length()){
            return true;
        }
        if(row < 0 || col < 0 || col >= board[0].length || row >= board.length){
            return false;
        }
        if(board[row][col] != word.charAt(idx)){
            return false;
        }
        
        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = dfs(row + 1, col, idx + 1, word, board) || dfs(row - 1, col, idx + 1, word, board) || dfs(row, col + 1, idx + 1, word, board) || dfs(row, col - 1, idx + 1, word, board);

        board[row][col] = temp;

        return found;
    }
}

