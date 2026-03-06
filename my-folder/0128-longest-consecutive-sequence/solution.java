class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int num : nums){
            store.add(num);
        }

        int longest = 0;

        for(int num : store){
            int curr = 0;
            if(!store.contains(num - 1)){
                int currNum = num;
                while(store.contains(currNum)){
                    curr += 1;
                    currNum += 1;
                }

                longest = Math.max(longest, curr);
            }
        }

        return longest;
    }
}
