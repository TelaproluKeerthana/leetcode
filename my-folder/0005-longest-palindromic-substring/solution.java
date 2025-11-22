class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 0, startPtr = 0, endPtr = 0;
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;
            while(left  >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(maxlen < right - left + 1){
                    maxlen = right - left + 1;
                    startPtr = left;
                    endPtr = right;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while(left  >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(maxlen < right - left + 1){
                    maxlen = right - left + 1;
                    startPtr = left;
                    endPtr = right;
                }
                left--;
                right++;
            }
        }

        return s.substring(startPtr, endPtr + 1);
    }
}
// maxlen = 0,
// startPtr = 0,
// endPtr = 0;
// // babad
//    i
//    l
//    r
