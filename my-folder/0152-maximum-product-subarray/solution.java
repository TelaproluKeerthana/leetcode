class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 0, suffix = 0;
        int len = nums.length;
        int res = nums[0];
        for(int i = 0; i < len; i++){
            prefix = nums[i] * (prefix == 0 ? 1 : prefix);
            suffix = nums[len - 1 - i] * (suffix == 0 ? 1 : suffix);
            res = Math.max(res, Math.max(prefix, suffix));
        }

        return res;
    }
}

// [2,3,-2,4]
//  res = 6

//   pre = 2 * 3 = 6 suff = 4 * -2 = -8
// [-2,0,-1]
// pre = -2 = 0
// suff = -1 = 0
// res = 0

// [2] [2, 3], [2, 3, -2], [2, 3, -2, 4]
// [3] [3, -2], [3, -2, 4]
// [4]
