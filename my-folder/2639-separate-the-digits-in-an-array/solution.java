class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--){
            int curr = nums[i];
            while(curr >= 10){
                int last = curr % 10;
                arr.add(last);
                curr = curr / 10;
            }
            arr.add(curr);
        }
        Collections.reverse(arr);
        int[] res = arr.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}

// arr = [13,25,83,77]
//               i

// deque = [7, 7, 3, 8, 5, 2, 3, 1] -> reverse this -> [1,3,2,5,8,3,7,7]
// 77 % 10

// if < 10 add it to que
// > 10 do mod until its less than 10 and add it to que 



