class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bot = rows;
        int left = 0;
        int right = cols;
        while(left < right && top < bot){
            for(int idx = left; idx < right; idx++){
                res.add(matrix[top][idx]);
            }
            top++;
            for(int idx = top; idx < bot; idx++){
                res.add(matrix[idx][right - 1]);
            }

            right--;

            if (!(left < right && top < bot)) {
                break;
            }

            for(int idx = right - 1; idx >= left; idx--){
                res.add(matrix[bot - 1][idx]);
            }
            bot--;
            for(int idx = bot - 1; idx >= top; idx--){
                res.add(matrix[idx][left]);
            }
            left++;
        }
    return res;
    }
}

// 1 2 3
// 4 5 6
// 7 8 9
