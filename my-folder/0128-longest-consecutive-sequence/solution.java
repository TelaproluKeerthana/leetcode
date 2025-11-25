class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int lcs = 0;
        for(int num : numSet){
            if(!numSet.contains(num - 1)){
                int cnt = 1;
                int curr = num + cnt;
                while(numSet.contains(curr)){
                    cnt += 1;
                    curr++;
                }
                lcs = Math.max(lcs, cnt);
            }
        }
        
        return lcs;
    }
}
