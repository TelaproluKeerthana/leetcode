class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right){
        if(left >= right){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int start = left;
        int start2 = mid + 1;
        int k = 0;
        
        //when either of these conditions fail then you may be left with only a half which needs merging
        while(start <= mid && start2 <= right){
            if(nums[start] <= nums[start2]){
                temp[k] = nums[start];
                k++;
                start++;
            }
            else{
                temp[k++] = nums[start2++];
            }
        }

        // when we are left with first half
        while(start <= mid){
            temp[k++] = nums[start++];
        } 

        // when we are left with second half 
        while(start2 <= right){ 
            temp[k++] = nums[start2++];
        }

        // rearrange the merged part into nums
        for(int i = 0; i < temp.length; i++){
            nums[left + i] = temp[i];
        }
    }
}
