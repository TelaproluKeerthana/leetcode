class Solution {  
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int row = 0, col = matrix[0].length - 1;
        while(row < rows && col >= 0){
            if(matrix[row][col] > target){
                col -= 1;
            }
            else if(matrix[row][col] < target){
                row += 1;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
