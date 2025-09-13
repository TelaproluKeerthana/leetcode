class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>(); 
        getSubSets(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

     private void getSubSets(int[] nums, int index, List<Integer> subset, List<List<Integer>> subsets){
         if (index == nums.length) {
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        getSubSets(nums, index + 1, subset, subsets);
        subset.remove(subset.size() - 1);
        
        getSubSets(nums, index + 1, subset, subsets);
    }
}
