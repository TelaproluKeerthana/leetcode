class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> cntMap = new HashMap<>();
        for(int num : nums){
            cntMap.put(num, cntMap.getOrDefault(num , 0) + 1);
        }
        int[] res = new int[2];
        int n = nums.length;
        for(int i = 1; i <= n; i++){
            if(cntMap.getOrDefault(i, 0) == 0){
                res[1] = i;
            }
            else if(cntMap.get(i) == 2){
                res[0] = i;  
            }
        }

        return res;
    }
}
