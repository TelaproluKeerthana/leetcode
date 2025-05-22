class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        while(curr <= right){
            //when we see a 0 swap it and place it to the left
            if(nums[curr] == 0){
                int temp = nums[curr];
                nums[curr] = nums[left];
                nums[left] = temp;
                left++;
                curr++;
            }
            //when we see a 2 push it to the end of the array and keep the current at the same position to check if the value to the left are all 0's
            else if(nums[curr] == 2){
                int temp = nums[curr];
                nums[curr] = nums[right];
                nums[right] = temp;
                right--;
            }
            else{
                curr++;
            }

        }
    }
}
