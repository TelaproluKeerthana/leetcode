class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int j = 0; j < nums.length - 3; j++){
            if(j > 0 && nums[j] == nums[j - 1]){
                    continue;
                }
// [-2, -1, 0, 0, 1, 2]
            for(int i = j + 1; i < nums.length - 2; i++){
                if(i > j + 1 && nums[i] == nums[i - 1]){
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while(left < right){
                    long val = (long) nums[left] + nums[right] + nums[i] + nums[j]; 
                    if(val > target){
                        right -= 1;
                    }
                    else if(val < target){
                        left += 1;
                    }
                    else{
                        result.add(Arrays.asList(nums[left], nums[right], nums[i], nums[j]));
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        right--;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }

            }
        }
        
        return result;
        
    }
}
