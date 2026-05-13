class Solution {
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;
        // map with idx, sum

        int[] diff = new int[limit * 2 +  2];
        
        for(int i = 0; i < n / 2; i++){
        int first = nums[i];
        int last = nums[n - 1 - i];

        // range between mini and maxi
        int mini = Math.min(first, last) + 1;
        int maxi = Math.max(first, last) + limit;

        int sum = first + last;

        diff[2] += 2;
        diff[limit * 2 + 1] -= 2;

        diff[sum] -= 1;
        diff[sum + 1] += 1;

        diff[mini] -= 1;
        diff[maxi + 1] += 1;
        }

        int ans = Integer.MAX_VALUE;
        int curr = 0;
        for(int i = 2; i <= limit * 2; i++){
            curr += diff[i];
            ans = Math.min(ans, curr);
        }

        return ans;
    }
}

