class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int[] nums = new int[n];
        int[] res = new int[queries.length];

        int cnt = 0;
        int resIdx = 0;
        for(int i = 0; i < queries.length; i++){
            
            int idx = queries[i][0];
            int color = queries[i][1];

            if(nums[idx] != 0){
               if(idx > 0 && nums[idx] == nums[idx - 1]) cnt--;  
               if(idx < n - 1 && nums[idx] == nums[idx + 1]) cnt--;
            }

            nums[idx] = color;

            if(idx > 0 && nums[idx] == nums[idx - 1]) cnt++;
            if(idx < n - 1 && nums[idx] == nums[idx + 1]) cnt++;

            res[i] = cnt;
            
        }

        return res;
    }
}

