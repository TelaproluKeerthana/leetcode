class Solution {
    List<List<Integer>> res; 
    Map<Integer, Integer> counter;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
       counter = new HashMap<>();
        for(int num : nums){
            counter.put(num, counter.getOrDefault(num, 0) +  1);
        }
        List<Integer> perm = new ArrayList<>();
        dfs(perm, nums);
        return res;
    }

    private void dfs(List<Integer> perm, int[] nums){
        if(perm.size() == nums.length){
            res.add(new ArrayList<>(perm));
            return;
        }

        for(int key: counter.keySet()){
            if(counter.get(key) > 0){
                perm.add(key);
                counter.put(key, counter.get(key) - 1);
                dfs(perm, nums);
                counter.put(key, counter.get(key) + 1);
                perm.remove(perm.size() - 1); // to explore the path starting with a different number
            }
        }
    }
}

// [1,1,2]


