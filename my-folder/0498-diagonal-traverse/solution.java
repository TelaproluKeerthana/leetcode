class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] res = new int[mat.length * mat[0].length];
        int idx = 0;
        Map<Integer, List<Integer>> diagonals = new HashMap<>();
         for(int row = 0; row < mat.length; row++){
                for(int col = 0; col < mat[0].length; col++){
                    if(!diagonals.containsKey(row + col)){
                        diagonals.put(row + col, new ArrayList<>());
                    }
                    diagonals.get(row + col).add(mat[row][col]);
                }
         }

         for(int key : diagonals.keySet()){
            List<Integer> list = diagonals.get(key);
            if(key % 2 == 0){
                Collections.reverse(list);
            }
            
            for(int i = 0; i < list.size(); i++){
                res[idx++] = list.get(i);
            }
         }
        
        return res;
    }
}


