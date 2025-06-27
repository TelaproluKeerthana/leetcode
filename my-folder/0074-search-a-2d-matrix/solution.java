class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bot = matrix.length - 1;
        int cols = matrix[0].length;
        while(top <= bot){
            int row = (top + bot) / 2;
            if(matrix[row][cols - 1] < target){
                top = row + 1;
            }
            else if(matrix[row][0] > target){
                bot = row - 1;
            }
            else{
                break;
            }
        }

        if (!(top <= bot)) {
        return false;
        } 

         int row = (top + bot) / 2;
        int l = 0, r = cols - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target > matrix[row][m]) {
                l = m + 1;
            } else if (target < matrix[row][m]) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
        
    }
}
