class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // if the diff is 0 meaning we found a valid subarray 
        map.put(0, 1);

        int currSum = 0;
        int res = 0;
        for(int num  : nums){
            currSum += num;
            int diff = currSum - k;
            res += map.getOrDefault(diff, 0);
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return res;
    }
}
// hm = {0 : 1, 1 : 1, 2 : 1}

// nums = [1,1,1]
//             i
// i = 0
// cs = 1
// res = 0
// diff = 1 - k = -1
// res += get(diff)

// i = 1
// cs = 2
// diff = 2 - 2 = 0
// res = 1
// hm[cs] = 1 + hm[cs]
     
// i = 2
// cs = 3
// diff = 3 - 2 = 1
// res += hm[diff] = 2
// hm[3] = 1 + hm[3]



