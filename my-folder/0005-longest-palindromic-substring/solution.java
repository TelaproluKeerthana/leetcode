class Solution {
    public String longestPalindrome(String s) {
        int maxResLen = 0;
        int startPtr = 0;
        int endPtr = 0;
        for(int i = 0; i < s.length(); i++){
            // for odd palindromes
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){    
               int reslen = right - left + 1;

                if(maxResLen < reslen){
                    maxResLen = reslen;
                    startPtr = left;
                    endPtr = right;
                }

                left -= 1;
                right += 1;
            }

            left = i;
            right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int reslen = right - left + 1;
                if(maxResLen < reslen){
                    maxResLen = reslen;
                    startPtr = left;
                    endPtr = right;
                }
                left -= 1;
                right += 1;
            }
            // for even palindromes

        }

        return s.substring(startPtr, endPtr + 1);
    }
}
