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

// [5, 1, 9, 11]
// [2, 4, 8, 10]
// [13, 3, 6,  7]
// [15, 14, 12,16]
// 9 - 2 - 14 - 7
// -----
// copy 5 replace 5 with 15, 15 with 16, 16 with 11 and 11 with the copied 5
// copy 1 replace 1 with 13, 13 with 12, 12 with 10, 10 with 1
// copy 9, replace 9 with 2, 2 with 14, 14 with 7,  7 with copied 9
// ---------
// copy 4 replace 4 with 3, replace 3 with 6, 6 with 8, 8 with copied 4
// --- 

