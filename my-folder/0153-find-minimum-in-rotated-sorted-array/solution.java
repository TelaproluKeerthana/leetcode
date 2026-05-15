class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] < nums[right]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return nums[left];
    }
}


// [3, 4, 5, 0, 2]

// do bs 
// if left < mid search in right half 
// else search in left half and return the left candidate 

// [3, 4, 5, 1, 2]
// l = 5 / mid = 2
// 3 < 5 then shift left = mid+ 1
// mid < right shift right to mid  
// and return the left most candidate

// [4,5,6,7,0,1,2]
// n = 7 mid = 3
// 4 < 7 
     

