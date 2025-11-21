class Solution {
    int row;
    int col;
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        row = m;
        col = n;
        return  dfs(0, 0, dp);
    }

    private int dfs(int r, int c, int[][] dp){
        
        if(r == row - 1 && c == col - 1){
            return 1;
        }

        if(r >= row || c >= col){
            return 0;
        }

        if(dp[r][c] != 0){
            return dp[r][c];
        }


        dp[r][c] = dfs(r + 1, c, dp) + dfs(r, c + 1, dp);

        return dp[r][c];
    }
}
