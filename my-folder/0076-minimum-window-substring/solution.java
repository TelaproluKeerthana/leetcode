class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] tFreq = new int[128];  // ASCII size
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        int left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;
        int required = t.length();
        
        while (right < s.length()) {
            char rChar = s.charAt(right);
            if (tFreq[rChar] > 0) required--; // needed char found
            tFreq[rChar]--; // can go negative if char is extra
            right++;

            // Now try to contract from left while valid
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char lChar = s.charAt(left);
                tFreq[lChar]++;
                if (tFreq[lChar] > 0) required++; // we lost a required char
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

