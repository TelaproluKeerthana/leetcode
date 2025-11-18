class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];
        int idx1 = 0, idx2 = n;
        for(int i = 0; i < n * 2; i += 2){
           res[i] = nums[idx1++];
           res[i + 1] = nums[idx2++];
        }

        return res;
    }
}
// res = [0 0 0 0]
// nums = [1 1 2 2]


