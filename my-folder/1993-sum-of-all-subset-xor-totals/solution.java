class Solution {
    public int subsetXORSum(int[] nums) {
        return xorSum(nums, 0, 0);
    }

    private int xorSum(int[] nums, int index, int currXOR){
        if(index == nums.length){
            return currXOR;
        }

        int withElement = xorSum(nums, index + 1, currXOR ^ nums[index]);
        int withoutElement = xorSum(nums, index + 1, currXOR);
        return withElement + withoutElement;
    }
}
