class Solution {
    public void rotate(int[][] matrix) {
        int top = 0;
        int bot = matrix.length - 1;


        while(top < bot){
            for(int i = 0; i < bot - top; i++){
                int left = top; 
                int right = bot;
                int first = matrix[top][left + i];
                matrix[top][left + i] = matrix[bot - i][left];
                matrix[bot - i][left] = matrix[bot][right - i];
                matrix[bot][right - i] = matrix[top + i][right];
                matrix[top + i][right] = first;
            }
            top++;
            bot--;
        }
    }
}


// 123 
// 456
// 789
// ----

// 00 copy this 
// update 00 with 20 
// 20 with 22 
// 22 with 02



