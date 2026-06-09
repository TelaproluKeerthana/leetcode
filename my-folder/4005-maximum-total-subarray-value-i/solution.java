class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxi = Arrays.stream(nums).max().getAsInt();
        int mini = Arrays.stream(nums).min().getAsInt();

        long maxSum = 0;
        while(k > 0){
            maxSum += (maxi - mini);
            k--;
        }

        return maxSum;
    }
}
