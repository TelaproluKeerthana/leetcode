class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int divisor = 1;
            while(curr / divisor >= 10){
                divisor *= 10;
            }

            while(divisor > 0){
                arr.add(curr / divisor);
                curr = curr % divisor;
                divisor /= 10;
            }
        }
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}

// arr = [13,25,83,77]
//               i

// deque = [7, 7, 3, 8, 5, 2, 3, 1] -> reverse this -> [1,3,2,5,8,3,7,7]
// 77 % 10

// if < 10 add it to que
// > 10 do mod until its less than 10 and add it to que 



