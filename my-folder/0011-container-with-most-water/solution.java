class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        while(left <= right){
            int mini = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, mini * (right - left));
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }

        return maxWater;
    }
}
