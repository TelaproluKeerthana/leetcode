class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_water = 0;
        while(left < right){
            int min_height = Math.min(height[left], height[right]);
            max_water = Math.max(max_water, min_height * (right - left));
            if(height[left] < height[right]) left += 1;
            else right -= 1;
        }

        return max_water;       
    }
}
