class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        int totalPivots = 0;

        for(int num : nums){
            if(num < pivot){
                smaller.add(num);
            }
            else if(num > pivot){
                larger.add(num);
            }
            else{
                totalPivots++;
            }
        }
        int i = 0;
        while(i < nums.length){

            while(smaller.size() > 0){
                nums[i] = smaller.get(0);
                smaller.remove(0);
                i++;
            }

            while(totalPivots > 0){
                nums[i] = pivot;
                totalPivots--;
                i++;
            }

            while(larger.size() > 0){
                nums[i] = larger.get(0);
                larger.remove(0);
                i++;
            }
        }

        return nums;
    }
}

// [9,12,5,10,14,3,10]

// total pivot elements++ = 2
// nums greater = [12, 14]
// nums smaller = [9, 5, 3]

// res[] = nums smaller + total pivot elements + nums larger
