class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> counter = new HashMap<>();
        int longestSubstrLength = 0;
        int left = 0;
        int maxFreq = 0;
        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            counter.put(curr, counter.getOrDefault(curr, 0) + 1);
            maxFreq = Math.max(maxFreq, counter.get(curr));
            // for every right value update the maxfreq and check if we can get a longest substr and update it
            while( (right - left + 1) - maxFreq > k){
                char leftChar = s.charAt(left);
                counter.put(leftChar, counter.get(leftChar) - 1);
                // variable size sliding window we shift the window until where we can make only k replacements and form a substring
                left++; 
            }

            longestSubstrLength = Math.max(longestSubstrLength, right - left + 1);
        }
  
    return longestSubstrLength;
    }
}
