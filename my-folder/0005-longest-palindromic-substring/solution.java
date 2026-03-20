class Solution {
    int maxLen = 0;
    int startPtr = 0;
    int endPtr = 0;
    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++){
            validPalindrome(s, i, i);
            validPalindrome(s, i, i+1);
        }
        return s.substring(startPtr, endPtr + 1);
    }

    private void validPalindrome(String s, int l, int r){
        if(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            if(maxLen < r - l + 1){
                maxLen = r - l + 1;
                startPtr = l;
                endPtr = r;
            }
            validPalindrome(s, l - 1, r + 1);
        }   
    }
}
