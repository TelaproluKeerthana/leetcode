class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int[] dp = new int[n];

        for (int center = 0; center < n; center++) {

            expand(s, center, center, k, dp);

            expand(s, center, center + 1, k, dp);
        }

        return dp[n - 1];
    }

    private void expand(String s, int left, int right, int k, int[] dp) {
        int n = s.length();

        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {

            int len = right - left + 1;

            if (len >= k) {
                int prev = (left > 0) ? dp[left - 1] : 0;
                dp[right] = Math.max(dp[right], prev + 1);
            }

            if (right > 0) {
                dp[right] = Math.max(dp[right], dp[right - 1]);
            }

            left--;
            right++;
        }
    }
}
