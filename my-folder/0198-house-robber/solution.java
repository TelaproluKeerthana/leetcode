class Solution {
    public int rob(int[] nums) {
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        else if(nums.length == 1){
            return nums[0];
        }

        int prevRob = nums[0];
        int currRob = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            int temp = currRob;
            currRob = Math.max(currRob, prevRob + nums[i]);
            prevRob = temp;
        }

        return currRob;
    }
}

// [1,2,3,1]
//  1 + 3 
//  2 + 1
// max(3, 4)
// return 4

// ----------
// e2 - 2,7,9,3,1
//          i

// currrob  = 12
// prev = 10
// max(10, 12) return 12
