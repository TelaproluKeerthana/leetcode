class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int[] res = new int[len];
        int[] pre = new int[len + 1];
        
        int common = 0;
        for(int i = 0; i < A.length; i++){
            pre[A[i]]++;
            
            if(pre[A[i]] == 2){
                common++;
            }
            pre[B[i]]++;
            if(pre[B[i]] == 2){
                common++;
            }
            res[i] = common;   
        } 

        return res;
    }
}
