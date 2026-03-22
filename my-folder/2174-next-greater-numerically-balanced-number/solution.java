class Solution {
    public int nextBeautifulNumber(int n) {

        for (int i = n + 1; ; i++) {
            if (isBalanced(i)) {
                return i;
            }
        }
    }

    private boolean isBalanced(int num) {
        int[] counts = new int[10];
        int temp = num;
    
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) return false; 
            counts[digit]++;
            temp /= 10;
        }

        for (int i = 1; i < 10; i++) {
            if (counts[i] > 0 && counts[i] != i) {
                return false;
            }
        }
        
        return true;
    }
}
