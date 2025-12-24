class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
                ans ^= nums[i];
        }

       return ans;
    }
}

// : nums = [2,2,1]
//               i 
// ans = nums[0] = 0010 
// ans  ^=  0010  = 0000 ^= 0001 = 0001, return this
