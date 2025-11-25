class Solution {
    public String minWindow(String s, String t) {
        int[] tMap = new int[128];
        int need = 0;
        
        for (char c : t.toCharArray()) {
            if (tMap[c] == 0) need++; 
            tMap[c]++;
        }

        int[] sMap = new int[128];
        int have = 0;

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            sMap[c]++;

            if (tMap[c] > 0 && sMap[c] == tMap[c]) {
                have++;
            }

            while (have == need) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);
                sMap[lc]--;

                if (tMap[lc] > 0 && sMap[lc] < tMap[lc]) {
                    have--;
                }

                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE)
                ? ""
                : s.substring(start, start + minLen);
    }
}

