class Solution {
    public int longestOnes(int[] nums, int k) {
        // sliding window approach 
        int totalZeros = 0;
        int left = 0, right = 0;
        int maxLen = 0;

        while(right < nums.length){
            if(nums[right] == 0){
                totalZeros += 1;
            }

            while(totalZeros > k){
                if(nums[left] == 0){
                    totalZeros--;
                }
                left += 1;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right += 1;
        }

        return maxLen;
    }
}
