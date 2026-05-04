class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            if(Arrays.deepEquals(mat, target)) return true;

            mat = rotate90(mat);

        }

        return false;
    }


    public int[][] rotate90(int[][] matrix){
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

        return matrix;
    }
}

// 0 1
// 1 0
