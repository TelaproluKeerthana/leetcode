class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> new_perms = new ArrayList<>();
            for (List<Integer> p : res) {
                for (int i = 0; i <= p.size(); i++) {
                    List<Integer> p_copy = new ArrayList<>(p);
                    p_copy.add(i, num);
                    new_perms.add(p_copy);
                }
            }
            res = new_perms;
        }
        return res;
    }

    // private void generatePermutations(int idx, int[] nums, ArrayList<Integer> curr, List<List<Integer>> res){
    //     if(curr.size() == nums.length()){
    //         res.append(curr);
    //         return;
    //     }

    //     int curr = 
    //     for(int i = idx; i < res.size(); i++){
    //         for(j = 0; j < i.size(); j++){
    //             res.get(i).add(j, curr);
    //             generatePermutations(idx + 1, nums, res);

    //         }
    //     }
    // }
}

// [1,2,3]
// i = 0
// curr = 1
// res = []
//       [[1]]
//       idx + 1, nums, res



