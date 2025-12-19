class Solution {
    public int jump(int[] nums) {
        int left = 0; 
        int right = 0; 
        int steps = 0;
        while(right < nums.length - 1){
            int maxtravel = 0;
           for(int i = left; i < right + 1; i++){
                maxtravel = Math.max(maxtravel, i + nums[i]);
           }

           left = right + 1;
           right = maxtravel;
           steps += 1;
        }

        return steps;
    }
}
