class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        updateCombinationSums(0, candidates, new ArrayList<>(), 0, target, result);
        return result;
    }

    private void updateCombinationSums(int idx, int[] candidates, List<Integer> curr, int currSum, int target, List<List<Integer>> result){

        if(currSum == target){
            result.add(new ArrayList<>(curr));
            return;
        }

        if(currSum > target) return;
        
        for(int i = idx; i < candidates.length; i++){
            // skipping duplicates
            if(i > idx && candidates[i] == candidates[i - 1]) continue;

            curr.add(candidates[i]);
            updateCombinationSums(i + 1, candidates, curr, currSum + candidates[i], target,     result);
            curr.remove(curr.size() - 1);

        }
    }
}
