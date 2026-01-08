class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n + m];

        int fp = 0, sp = 0, i = 0;

        while (fp < n && sp < m) {
            if (nums1[fp] <= nums2[sp]) {
                merged[i++] = nums1[fp++];
            } else {
                merged[i++] = nums2[sp++];
            }
        }

        while (fp < n) {
            merged[i++] = nums1[fp++];
        }

        while (sp < m) {
            merged[i++] = nums2[sp++];
        }

        int len = n + m;
        if (len % 2 == 1) {
            return merged[len / 2];
        } else {
            return (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
        }
    }
}

