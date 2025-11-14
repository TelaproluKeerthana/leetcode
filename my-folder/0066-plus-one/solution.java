class Solution {
    public int[] plusOne(int[] digits) {
       int carry = 1;
       int n = digits.length;
       List<Integer> lis = new ArrayList<>();
       for(int idx = n - 1; idx >= 0; idx--){
            int sum = carry + digits[idx];
            carry = sum / 10;
            lis.add(sum % 10);
       } 

       if(carry == 1){
        lis.add(1);
       }

       // reverse the list
       int[]  res = new int[lis.size()];
       int siz = lis.size() - 1;
       for(int i = 0; i < lis.size(); i++){
        res[i] = lis.get(siz--);
       }

       return res;
    }
}

    // 1 2 3
    // lis = 4 2

         
