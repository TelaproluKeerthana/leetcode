class Solution {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length - 1;

        while(left < right){
            for(int i = 0; i < right - left; i++){
                int top = left,bot = right;
                int first = matrix[top][left + i];
                matrix[top][left + i] = matrix[bot - i][left];
                matrix[bot - i][left] = matrix[bot][right - i];
                matrix[bot][right - i] = matrix[top +  i][right];
                matrix[top + i][right] = first;
            }
            left++;
            right--;
            
        }
    }
}


// 1 2 3
// 4 5 6
// 7 8 9

