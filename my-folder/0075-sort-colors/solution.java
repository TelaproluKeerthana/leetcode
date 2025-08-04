class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int curr = 0;
        int right = nums.length - 1;
        while(curr <= right){
            //all the 0's are to be stored in the front
            if(nums[curr] == 0){
                int temp = nums[left];
                nums[left++] = nums[curr];
                nums[curr++] = temp;
            }
            // all 2's should be at the end, curr should be incremented only when the we encounter a 0, 
            else if(nums[curr] == 2){
                int temp = nums[right];
                nums[right--] = nums[curr];
                nums[curr] = temp;
            }
            // this is the care where 1's, we move to next element as 1's are supposed to be in the center
            else{
                curr++;
            }
        }
    }
}
