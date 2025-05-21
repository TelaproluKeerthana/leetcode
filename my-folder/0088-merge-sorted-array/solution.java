class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        // idx to keep track of the position until where we sorted already
        int idx = m + n - 1;

        while(left >= 0 && right >= 0){
            if(nums1[left] > nums2[right]){
                nums1[idx--] = nums1[left--];
            }
            else{
                nums1[idx--] = nums2[right--];
            }
        }

        while(right >= 0){
            nums1[idx--] = nums2[right--];
        }
    }
}
