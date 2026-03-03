class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        int curr = 0;
        while(curr <= right){
            if(nums[curr] == 0){
                int temp = nums[left];
                nums[left++] = nums[curr];
                nums[curr++] = temp;
            }
            else if(nums[curr] == 2){
                int temp = nums[right];
                nums[right--] = nums[curr];
                nums[curr] = temp;  
            }
            else{
                curr++;
            }
        }

    }
}
// key takeaway is we're ideally creating three partitions and assigning elements into elements the curr element decides if it belongs to left partition(1's) or the right partition(2's) and assign element to that partition..


// l = 0
// r = 6

// [0,0,1,1,2,2]
         // c
//  l       r
        // loop breaks
           
// swap 2 0


