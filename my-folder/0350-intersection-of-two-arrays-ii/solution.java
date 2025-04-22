import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<>();
        // now the length of the nums1 are small
        int left = 0;
        int right = 0;
        while (left < nums1.length && right < nums2.length){
            if(nums1[left] == nums2[right]){
                res.add(nums1[left]);
                left += 1;
                right += 1;
            }
            else if(nums1[left] < nums2[right]){
                left += 1;
            }
            else{
                right += 1;
            }
        }
       int[] result = new int[res.size()];
       for(int k = 0; k < res.size(); k++){
            result[k] = res.get(k);
       }
       return result; 
    }
}
