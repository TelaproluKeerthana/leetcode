class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> cntMap = new HashMap<>();
        int maxFreq = 0;
        int left = 0;
        int lcr = 0;
        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            cntMap.put(curr, cntMap.getOrDefault(curr, 0) + 1);
            maxFreq = Math.max(maxFreq, cntMap.get(curr));
            while(right - left + 1 - maxFreq > k){
                char prev = s.charAt(left);
                cntMap.put(prev, cntMap.get(prev) - 1);
                left++;
            }
            lcr = Math.max(right - left + 1, lcr);
        }
        return lcr;
    }
}
// window = {a : 2, b : 2} maxfreq = 2; 4 - 2 update lcr = to window length and return it

// ABAB 
// k = 2
