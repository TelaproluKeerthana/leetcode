class Solution {
    public void rotate(int[] nums, int k) {
        int steps = k % nums.length;
        if(steps == 0){
            return;
        }
        List<Integer> dummy = new ArrayList<>();
        int start_idx = (nums.length) - steps;
        
        for(int i = start_idx; i < nums.length; i++){
            dummy.add(nums[i]);
        }

        for(int i = 0; i < start_idx; i++){
            dummy.add(nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = dummy.get(i);
        }
    }
}
