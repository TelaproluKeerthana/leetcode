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

// l = 0
// r = 6

// [2,0,2,1,1,0]
//  l         r

// [0 0 1 1 2 2]
//      l    
//        r
           
// swap 2 0


