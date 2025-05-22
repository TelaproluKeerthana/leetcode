class NumMatrix {
    private int[][] prefixMatrix;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        prefixMatrix = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                prefixMatrix[i][j] = matrix[i - 1][j - 1] 
                                    + prefixMatrix[i - 1][j]
                                    + prefixMatrix[i][j - 1]
                                    - prefixMatrix[i - 1][j - 1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        //shifting for it to be 1-indexed
        int r1 = row1 + 1, c1 = col1 + 1, r2 = row2 + 1, c2 = col2 + 1;

        return prefixMatrix[r2][c2]
         - prefixMatrix[r1 - 1][c2] 
         - prefixMatrix[r2][c1 - 1]
          + prefixMatrix[r1 - 1][ c1 - 1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
