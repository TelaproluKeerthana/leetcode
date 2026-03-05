class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i + 1] <= nums[i]){
            i--;
        }

        if(i >= 0){
            int j = nums.length - 1;
            // finding the greatest element after i
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        // after swapping reverse the entire array from i+1 
        reverse(nums, i + 1);
    }

    public void swap(int[]nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void reverse(int[] nums, int start){
        int end = nums.length - 1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}



// arr = [1,2,3]
//            i

         

// max element 
// then second max element from the end 
// swap them 
// then do a reverse from the i+1th element element after swapping 

       
