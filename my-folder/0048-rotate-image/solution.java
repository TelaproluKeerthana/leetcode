class Solution {
    public void rotate(int[][] matrix) {

        int left = 0;
        int right = matrix.length - 1;
        while(left < right){
            for(int i = 0; i < right - left; i++){
                int top = left, bottom = right;
                int first = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom ][right - i] = matrix[top + i][right];
                matrix[top + i][right] = first;
            }
            left++;
            right--;
        }
        
    }
}
// we do each rotation length - 1 times 

// 00 - 20
// 01 - 10 
// 02 - 00
// -----
// 10 - 21
// 11 - 11
// 12 - 01
// -----
// 20 - 22
// 21 - 12
// 22 - 02 
//    00 01 02         copy 00 to a variable
                        // put 20 in variable 
                        // put 22 in 20
                        // put 12 in 22
                        // put copied 00 in 12
// 00  1  2  3  - 1 4 3
// 10  4  5  6    2 
// 20  7  8  9  

// 7 4 1
// 8 5 2
// 9 6 3
