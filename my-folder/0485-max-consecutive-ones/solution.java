class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longestConsequetiveLen = 0;
        int l = 0, r = 0;
        while(l <= r && r < nums.length){
            if(nums[r] == 1){
                if(longestConsequetiveLen < r - l + 1){
                    longestConsequetiveLen = r - l + 1;
                }
                r++;
            }
            else{
                r++;
                l = r;
            }
        }
        return longestConsequetiveLen;
    }
}

// [1,1,0,1,1,1]
//        l
//            r 
