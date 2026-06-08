class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int left = 0; 
        int right = n- 1;

        int start = 0;
        int end = n - 1;
        int[] res = new int[n];

        while(left < n && right >= 0){
            if(nums[left] < pivot){
                res[start++] = nums[left];
            }
            if(nums[right] > pivot){
                res[end--] = nums[right];
            }
            left++;
            right--;
        }

        for(int i = start; i <= end; i++){
            res[i] = pivot;
        }

        return res;
    }
}
