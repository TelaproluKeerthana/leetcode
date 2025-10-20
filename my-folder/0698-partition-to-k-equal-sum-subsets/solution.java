class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int totalSum = 0;
        for(int num: nums){
            totalSum += num;
        }
        if(totalSum % k != 0){
            return false;
        }
        
        Arrays.sort(nums);
        reverse(nums);

        // create a boolean array to keep track of the used elements 
        boolean[] elements = new boolean[nums.length];
        return dfs(0, 0, totalSum / k , k, elements, nums);
    }

    public boolean dfs(int idx, int currPSum, int partitionSum, int remainingPartitons, boolean[] elements, int[] nums){
        // base cases
        if(remainingPartitons == 0){
            return true;
        }

        if(currPSum == partitionSum){
            return dfs(0, 0, partitionSum, remainingPartitons - 1, elements, nums);
        }

        for(int j = idx; j < nums.length; j++){
           if(elements[j] || currPSum + nums[j] > partitionSum){
                continue;
           }

           elements[j] = true;
           if(dfs(j + 1, currPSum + nums[j], partitionSum, remainingPartitons, elements, nums)){
            return true;
           }

           elements[j] = false;
        }
        return false;

    }

    public void reverse(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left  < right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}

// [4,3,2,3,5,2,1]
// k = 4
// sum == 20 so each partition should be 5

// nums, idx, partition = [0, 0, 0, 0], sum = 5
// for(i in partition)



