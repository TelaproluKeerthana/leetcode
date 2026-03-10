class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int prev = 0;
        int curr = 0;
        for(int num : nums){
            int temp = curr;
            curr = Math.max(curr, prev + num);
            prev = temp;
        }

        return curr;
    }
}
      
// nums = [1, 2, 3, 1]
//               i

// maxprofit = 4
// curr = prev + i = 3
// prev = curr = 

// nums = [2, 7, 9, 3, 1]
//               i 

// maxProfit = max(11, 7) = 12
// curr = 2 + 9(11) = 7 + 3(10) = 11 + 1(12)
// prev = 10


