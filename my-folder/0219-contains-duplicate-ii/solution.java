class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> numbers = new HashSet<>();
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            while(right - left > k){
                numbers.remove(nums[left]);
                left += 1;
            }
            if(numbers.contains(nums[right])){
                return true;
            }
            numbers.add(nums[right]);
        }

        return false;
    }
}
