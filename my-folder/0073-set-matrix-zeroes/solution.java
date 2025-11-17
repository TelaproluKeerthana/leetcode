class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<int[]> zeroCells = new LinkedList<>();
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                if(matrix[r][c] == 0) zeroCells.offer(new int[]{r, c});
            }
        }

        while(!zeroCells.isEmpty()){
            int[] curr = zeroCells.poll();
            for(int i = 0; i < matrix.length; i++){
             if(matrix[i][curr[1]] != 0) matrix[i][curr[1]] = 0;
            }
            for(int i = 0; i < matrix[0].length; i++){
            if(matrix[curr[0]][i] != 0) matrix[curr[0]][i] = 0;
            }
        }
    }
}

