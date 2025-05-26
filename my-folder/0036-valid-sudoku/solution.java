class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> rowHash = new HashMap<>();
        Map<Integer, HashSet<Character>> colHash = new HashMap<>();
        Map<Integer, HashSet<Character>> subGridHash = new HashMap<>();
        int rows = board.length;
        int cols = board[0].length;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == '.') continue;
                
                if(!rowHash.containsKey(i)){
                    rowHash.put(i, new HashSet<Character>());
                }

                if(rowHash.get(i).contains(board[i][j])){
                    return false;
                }

                rowHash.get(i).add(board[i][j]);

                if(!colHash.containsKey(j))
                {
                    colHash.put(j, new HashSet<Character>());
                } 

                if(colHash.get(j).contains(board[i][j])){
                    return false;
                }
                
                colHash.get(j).add(board[i][j]);

                int key = getSubGridKey(i, j);
                if(!subGridHash.containsKey(key))
                {
                    subGridHash.put(key, new HashSet<Character>());
                } 

                if(subGridHash.get(key).contains(board[i][j])){
                    return false;
                }
                
                subGridHash.get(key).add(board[i][j]);
            }
        }

        return true;
    } 
    
    private int getSubGridKey(int row, int col){
        if(row/3 == 0){
            return col/3;
        }
        else if(row/3 == 1){
            return 3 + col/3;
        }
        
        return 6 + col/3;  
    }
}


