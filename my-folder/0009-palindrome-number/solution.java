class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int original = x;
        int res = 0;
        while(x != 0){
            int digit = x % 10;

            if(res > Integer.MAX_VALUE / 10) return false;

            res = res * 10 + digit;
            x /= 10;
        }

        return res == original;
    }
}
