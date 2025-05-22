class NumMatrix {
    private int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = Math.min(row1, row2); i <= Math.max(row1, row2); i++){
            for(int j = Math.min(col1, col2); j <= Math.max(col1, col2); j++){
                sum += matrix[i][j];
            }
        }
            return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
