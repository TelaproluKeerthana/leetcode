class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> alist = new ArrayList<>();
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int currSum = carry + digits[i];
            carry = currSum / 10;
            alist.add(currSum % 10);
        }

        if(carry == 1){
            alist.add(1);
        } 
        int[] res = new int[alist.size()];
        int idx = 0;
        for(int i = alist.size() - 1; i >= 0; i--){
            res[idx++] = alist.get(i);
        }

        return res;
    }
}

// 123
 
//  currIdx = len - 1
//  lastelement = digits[len - 1]
//  if(lastelem == 9){
//     lastelem = 0
//     currIdx = currIdx - 1
//  }

// currSum = 1 + 3
// 123
//   i

