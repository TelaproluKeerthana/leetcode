class Solution {
    public int maxSubArray(int[] nums) {
       return divide(nums, 0, nums.length - 1);
    }

    private int divide(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        int leftMax = divide(nums, left, mid);
        int rightMax = divide(nums, mid + 1, right);
        int crossMax = maxCrossing(nums, left, mid, right);
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    private int maxCrossing(int[] nums, int left, int mid, int right){
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = mid; i >= left; i--){
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for(int i = mid + 1; i <= right; i++){
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }    
}
// gm = 6
// cs = 5
// // [-2,1,-3,4,-1,2,1,-5,4]
//             l 
//                         r
    

