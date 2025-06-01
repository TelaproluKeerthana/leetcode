class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int[] prefMax = new int[length];
        int[] suffMax = new int[length];

        prefMax[0] = height[0];
        for(int i = 1; i < length; i++){
            prefMax[i] = Math.max(height[i], prefMax[i - 1]);
        }

        suffMax[length - 1] = height[length - 1];
        for(int i = length - 2; i >= 0; i--){
            suffMax[i] = Math.max(height[i], suffMax[i + 1]);
        }
        System.out.println(Arrays.toString(prefMax));
        System.out.println(Arrays.toString(suffMax));
        int waterTrapped = 0;
        for(int i = 0; i < length; i++){
            waterTrapped += Math.abs(Math.min(prefMax[i], suffMax[i]) - height[i]);
        }

        return waterTrapped;
    }
}
