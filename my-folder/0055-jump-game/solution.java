class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        int farthest = 0;
        for(int idx = 0; idx <= goal; idx++){
            if(idx > farthest){
                return false;
            }
            farthest = Math.max(idx + nums[idx], farthest);
            if(farthest >= goal){
                return true;
            }
        }
        return true;
    }
}

//  [2,3,1,1,4]
    //    1+3
    //      2+1

// [3,2,1,0,4]
    //       i > farthest
    //   2+1 1+2
    // 0+3
    // farthest = 3
         
