class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        generateSubSets(nums, 0, new ArrayList<>());
        return result;
    }

    public void generateSubSets(int[] nums, int idx, ArrayList<Integer> currSub){
        if(idx == nums.length){
         result.add(new ArrayList<>(currSub));
         return;   
        }
        currSub.add(nums[idx]);
        generateSubSets(nums, idx + 1, currSub);
        currSub.remove(currSub.size() - 1);
        while(idx + 1 < nums.length && nums[idx] == nums[idx + 1]){
            idx++;
        }
        generateSubSets(nums, idx + 1, currSub);
    }
}


// 1, 2, 2


// List<List<Integer>> result = new ArrayList<>();
        // for(int i = 0; i < nums.length; i++){
        //     List<Integer> currSub = new ArrayList<>();
        //     for(int j = 0; j <= i; j++){
        //         currSub.add(num[j]);
        //     }
        // }
