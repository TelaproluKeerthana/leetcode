class Solution {
    public int maxProduct(int[] nums) {
        int currMin = 1;
        int currMax = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int num : nums){
            int temp = num * currMax;
            currMax = Math.max(num, Math.max(temp, currMin * num));
            currMin = Math.min(num, Math.min(temp, currMin * num));

            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;   
    }
}

