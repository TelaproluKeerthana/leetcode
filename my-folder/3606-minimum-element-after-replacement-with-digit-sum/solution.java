class Solution {
    public int minElement(int[] nums) {
        int currMin = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int updated = 0;
            while(curr > 0){
                updated += curr % 10;
                curr /= 10;
                if(updated > currMin) curr = 0;
            }
            // nums[i] = updated;
            if(updated < currMin){
                currMin = updated;
            }
        }

        return currMin;
    }
}
