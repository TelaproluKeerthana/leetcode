class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j ++;
            }
        }
        return j;
        
        // ArrayList<Integer> alist = new ArrayList<>();
        // for(int num:nums){
        //     alist.add(num);
        // }
        // alist.removeIf(n -> n == val);
        
        // int[] arr = new int[alist.size()];
        // for(int i = 0; i < alist.size(); i++){
        //     arr[i] = alist.get(i);
        // }
        // return alist.size();
    }
}
