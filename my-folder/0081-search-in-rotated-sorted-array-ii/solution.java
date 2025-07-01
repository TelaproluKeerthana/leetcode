class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return true;
            }
            if (nums[mid] == nums[left]) {
                left++;
                continue;
            }

            if(nums[left] <= nums[mid]){
                if(target < nums[mid] && nums[left] <= target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(target <= nums[right] && nums[mid] < target){
                    left = mid + 1;
                 }
                else{
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}

// [2,5,6,0,0,1,2]
// left = 0
// right = 6
// mid = 3 = 0
// mid = 3 = 0 
// target = 3
// 2 <= 0 
// target == 0 return true

