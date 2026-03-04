class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // find the next smallest element
        while(i >= 0 && nums[i + 1] <= nums[i]){
            i--;
        }

        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1);
    }

     public void swap(int[] nums, int s1, int s2){
        int temp = nums[s1];
        nums[s1] = nums[s2];
        nums[s2] = temp;
    }

    public void reverse(int[] nums, int start){
        int rear = nums.length - 1;
        int front = start; 
        while(front < rear){
            swap(nums, front, rear);
            front++;
            rear--;
        }
    }

}

// find decreasing element first within a sequence, then 
// we need to perform a swap and a reverse
// find pair with larger elemennts 
// then from the next element from the second largest element reverse the elements.
// return the array after reversing
// if no such elements are present then reverse the entire array
