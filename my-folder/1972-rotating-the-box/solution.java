class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
   
        for(int i = 0; i < m; i++){
            int empty = n - 1;
            for(int j = n - 1; j >= 0; j--){
                if(boxGrid[i][j] == '*'){
                    empty = j - 1;
                }else if(boxGrid[i][j] == '#'){
                    boxGrid[i][j] = '.';
                    boxGrid[i][empty] = '#';
                    empty--;
                }
            }

        }

        char[][] res = new char[n][m];
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                res[c][m - 1 - r] = boxGrid[r][c]; 
            }
        } 
        

        return res;
    }
}


// you're turning the box and the stone will shirt downwards until there is * or other stone in that column 

//  0 0 -> 0 0
//  0 1 -> 1 0
//  0 2 -> 2 0

// boxgrid[r][c] = boxgrid[]

// res[0][0] = bg[0][n-j]
