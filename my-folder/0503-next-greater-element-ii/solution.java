class Solution {
    public int[] nextGreaterElements(int[] nums) {
     int len = nums.length;
      int[] doubleNums = new int[nums.length * 2];

     for(int i = 0; i < len; i++){
        doubleNums[i] = nums[i];
        doubleNums[len + i] = nums[i];
     }
    // iterate over the original array
    int[] res = new int[len];
     for(int i = 0; i < len; i++){  
        res[i] = -1;
        for(int j = i + 1; j < doubleNums.length; j++){
            if(doubleNums[j] > nums[i]){
                res[i] = doubleNums[j];
                break;
            }
        }
     } 

     return res;

    }
}
