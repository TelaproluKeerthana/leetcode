class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        for(int row = 0; row < rowLength; row++){
            for(int col = 0; col < colLength; col++){
                if(grid[row][col] == 1){
                    int sides = 4;
                    if(row > 0 && grid[row - 1][col] == 1) sides--;
                    if(row < rowLength - 1 && grid[row + 1][col] == 1) sides--;
                    if(col > 0 && grid[row][col  - 1] == 1) sides--;
                    if(col < colLength - 1 && grid[row][col + 1] == 1) sides--;

                    perimeter += sides;
                }
            }
        }

        return perimeter;
    }
}


