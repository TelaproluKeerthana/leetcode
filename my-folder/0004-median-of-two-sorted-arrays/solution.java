class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = nums1[i];
        }

        int idx = nums1.length;
        for(int i = 0; i < nums2.length; i++){
            res[idx++] = nums2[i];
        }

        Arrays.sort(res);
        int len = res.length;
        if(res.length % 2 != 0){
            return res[len / 2];
        }
        else{
            return (double)(res[len / 2] + res[(len / 2) - 1]) / 2;
        }

    }
}
