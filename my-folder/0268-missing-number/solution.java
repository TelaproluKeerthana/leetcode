class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for(int i = 0; i < nums.length; i++){
            missing ^= i ^ nums[i];
        }

        return missing;
    }
}

// 0011

// XOR -  

// 0011 ^ 0011 = 0000
// 0000 ^ 0001 = 0001
// 0001 ^ 0011 = 
// missing = 0010
