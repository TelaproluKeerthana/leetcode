class Solution {
    public int[] sortArray(int[] nums) {
     // split array into half until only 1 element is presentin each compare those two merge halves
     // return the end result
     mergeSort(nums, 0, nums.length - 1);
     return nums;    
    }

    public void mergeSort(int[] nums, int left, int right){
        while(left >= right){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left,int mid, int right){
        int[] temp = new int[right - left + 1];
        int start = left;
        int start2 = mid + 1;
        int idx = 0;
        while(start <= mid && start2 <= right){
            if(nums[start] < nums[start2])temp[idx++] = nums[start++];
            else temp[idx++] = nums[start2++];
        }

        // when either of the halves still exist
        while(start <= mid){
            temp[idx++] = nums[start++];
        }

        while(start2 <= right){
            temp[idx++] = nums[start2++];
        }

        for(int i = 0; i < temp.length; i++){
            nums[left + i] = temp[i];
        }
    }


}
