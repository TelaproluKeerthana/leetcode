class Solution {
    public int maxSubArray(int[] nums) {
       int globalMax = Integer.MIN_VALUE;
       int right = 0;
       int currSum = 0;
       while(right < nums.length){
            currSum  += nums[right];
            if(currSum > globalMax){
                globalMax = currSum;
            }
            right++;
            if(currSum < 0){
                currSum = 0;
            }
       }

       return globalMax;
    }
}
// gm = 6
// cs = 5
// // [-2,1,-3,4,-1,2,1,-5,4]
//             l 
//                         r
    

