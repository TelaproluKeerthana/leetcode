class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> a1 = new HashSet<>();
       
        for(int num : arr1){
            while(num > 0){
                a1.add(num);
                num /= 10;
            }
        }
        int maxLen = 0;
        for(int num : arr2){
            int curr = num;
            while(curr > 0){
                if(a1.contains(curr)){
                    maxLen = Math.max(maxLen, String.valueOf(curr).length());
                    break;
                }
                curr /= 10;
            }
        }
        return maxLen;
    }
}

// [1,10,100]

