class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindowLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                minWindowLength = Math.min(minWindowLength, right - left + 1);
                sum -= nums[left];
                left += 1;
            }

        }

        return minWindowLength == Integer.MAX_VALUE ? 0 : minWindowLength;
    }
}
