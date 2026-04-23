class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> numMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            int curr = nums[i];
            numMap.computeIfAbsent(curr, k -> new ArrayList<>()).add(i);
        }

        long[] res = new long[n]; 

        for (List<Integer> indices : numMap.values()) {
            int m = indices.size();
            
            long[] prefix = new long[m + 1];
            for (int i = 0; i < m; i++) {
                prefix[i + 1] = prefix[i] + indices.get(i);
            }

            // Step 3: compute result for each index
            for (int j = 0; j < m; j++) {
                int idx = indices.get(j);

                long left = (long) idx * j - prefix[j];
                long right = (prefix[m] - prefix[j + 1]) - (long) idx * (m - j - 1);

                res[idx] = left + right;
            }
        }

        return res;
    }
}

