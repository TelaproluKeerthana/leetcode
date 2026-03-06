class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // we track the intersection of row0 and col0 seperately using this flag 
        int col0 = 1;

       // update all the first row and col positions to 0 when we encounter a zero 
        for(int row = 0; row < rows; row++){
           
            if(matrix[row][0] == 0) col0 = 0;

            for(int col = 1; col < cols; col++){
                if(matrix[row][col] == 0){
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // update from last index position to avoid overwriting markers  
        for(int row = rows - 1; row >= 0; row--){
            for(int col = cols - 1; col >= 1; col--){
                if(matrix[row][0] == 0 || matrix[0][col] == 0){
                    matrix[row][col] = 0;
                }
            }

            if(col0 == 0) matrix[row][0] = 0;
        }
    }
}


