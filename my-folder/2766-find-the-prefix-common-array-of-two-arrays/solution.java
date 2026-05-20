class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            res[i] = i == 0 ? 0 : res[i - 1];
            
            if(A[i] == B[i]){
                res[i]++;
            }

            else{
                if(aSet.contains(B[i])){
                    res[i]++;
                }
                if(bSet.contains(A[i])){
                    res[i]++;
                }
            }

            aSet.add(A[i]);
            bSet.add(B[i]);   
        }

        return res;
    }
}
