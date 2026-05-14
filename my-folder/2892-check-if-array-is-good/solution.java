class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
       
        int maxi = nums[nums.length - 1];
        int n = nums.length;
        if(n < maxi + 1){
            return false;
        }

        for(int i = 0; i < n - 1; i++){
            if(nums[i] != i + 1){
                return false;
            }
        }


        return true;
    }
}
