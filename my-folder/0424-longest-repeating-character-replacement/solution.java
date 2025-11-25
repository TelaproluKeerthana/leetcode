class Solution {
    public int characterReplacement(String s, int k) {
        int[] cntMap = new int[26];
        int maxFreq = 0;
        int left = 0;
        int lcr = 0;
        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            cntMap[curr - 'A'] += 1;
            maxFreq = Math.max(maxFreq, cntMap[curr - 'A']);
            while(right - left + 1 - maxFreq > k){
                char prev = s.charAt(left);
                cntMap[prev- 'A'] -= 1;
                left++;
                for(int i = 0; i < 26; i++){
                    maxFreq = Math.max(maxFreq, cntMap[i]);
                }
            }

            lcr = Math.max(right - left + 1, lcr);
        }
        return lcr;
    }
}
// window = {a : 2, b : 2} maxfreq = 2; 4 - 2 update lcr = to window length and return it

// ABAB 
// k = 2
