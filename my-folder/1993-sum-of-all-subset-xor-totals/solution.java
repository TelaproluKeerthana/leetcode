class Solution {
    public int subsetXORSum(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>(); 
    getSubSets(nums, 0, new ArrayList<>(), subsets);
    int result = 0;
    for(List<Integer> subset : subsets){
        int subsetXORTotal  = 0;
        for(int num: subset){
            subsetXORTotal ^= num;
        }
        result += subsetXORTotal;
    }
    return result;
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


