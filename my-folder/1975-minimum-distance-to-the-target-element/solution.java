class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if (nums[start] == target) return 0;
        int minDist = Integer.MAX_VALUE;
        
        for(int idx = 0; idx < nums.length; idx++){
            if(nums[idx] == target){
                minDist = Math.min(minDist, Math.abs(start - idx));
            }
        }

        return minDist;
    }
}
