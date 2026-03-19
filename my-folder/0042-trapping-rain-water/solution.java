class Solution {
    public int trap(int[] height) {
        int lmax = 0, rmax =  0, waterTrapped = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= lmax){
                    lmax = height[left];
                }
                else{
                    waterTrapped += lmax - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= rmax){
                    rmax = height[right];
                }
                else{
                    waterTrapped += rmax - height[right];
                }
                right--;
            }
        }

        return waterTrapped;
    }
}

//                      R
// [0,1,0,2,1,0,1,3,2,1,2,1]
//    L

// [0 1 1 2 2 2 2 3 3 3 3 3] - PRE
// [3,3,3,3,3,3,3,3,2,2,2,1] - SUFF
// [0 1 1 2 2 2 2 0 2 2 2 1] - SUB
