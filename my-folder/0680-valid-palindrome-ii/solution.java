class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            // when we see a mismatched character we update flag to false and move it to next character
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(left + 1, right, s) || isPalindrome(left, right - 1, s);
            }
            left += 1;
            right -= 1;
        }
        return true;
    }


    private boolean isPalindrome(int left, int right, String s){
        while(left  < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
      
}
