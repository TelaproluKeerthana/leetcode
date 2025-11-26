class Solution {
    public int search(int[] nums, int target) {
     int left = 0;
     int right = nums.length - 1;
     while(left <= right){
        int mid = left + (right - left) / 2;
        if(nums[mid] == target){
            return mid;
        }
        
        if(nums[left] <= nums[mid]){
            if(target < nums[left] || nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        else{
            if(nums[mid] > target || target > nums[right]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

    } 
        return -1;  
    }
}

    // l
    //       m
    //             r
// [4,5,6,7,0,1,2]
// mid = 3(7)
// 4 < 7 and target > nums[left] (4) :
//     left = mid + 1 [4]


// left = 4 right = 7 11/2 = 5
// nums[left] < nums[mid] && target < nums[left]:
//     search in right half
// else
//     shrink right to the mid

// nums[left] = 4 nums[right] = 5
//     mid = 4
//     if(nums[mid] == target):
//         return mid

// target = 0


