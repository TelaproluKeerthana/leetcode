class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIdx = 0;
        int negIdx = 1;
        int[] res = new int[nums.length];
        
        for(int num : nums){
            if(num > 0){
               res[posIdx] = num;
               posIdx += 2;
            }
            else{
                res[negIdx] = num;
                negIdx += 2;
            }
        }
    
        return res;
    }
}
