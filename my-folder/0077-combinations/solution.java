class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        getCombinations(1, n, k, new ArrayList<>(), combinations);
        return combinations;
    }

    private void getCombinations(int idx, int n, int k, ArrayList<Integer> curr, List<List<Integer>> combinations){
        if(curr.size() == k){
            combinations.add(new ArrayList<>(curr));
            return;
        }

        if(idx > n){
            return;
        }

        for(int i = idx; i < n + 1; i++){
            curr.add(i);
            getCombinations(i + 1, n, k, curr, combinations);
            curr.remove(curr.size() - 1);
        }
    }
}
