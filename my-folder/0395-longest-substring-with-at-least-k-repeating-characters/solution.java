class Solution {
    public int longestSubstring(String s, int k) {
       if (s == null || s.isEmpty() || k > s.length()) {
            return 0;
        }  

        int[] countMap = new int[26];
        int n = s.length();
        int result = 0;
        for(int start = 0; start < n; start++){
            Arrays.fill(countMap, 0);
            for(int end = start; end < n; end++){
                countMap[s.charAt(end) - 'a']++;

                if(isValid(s, k, countMap)){
                    result = Math.max(result, end - start + 1);
                }
            }
        }

        return result;
    }

    private boolean isValid(String s, int k, int[] countMap) {
        int countLetters = 0, countAtleastK = 0;
        for(int freq : countMap){
            if(freq > 0) countLetters++;
            if(freq >= k) countAtleastK++;
        }

        return countAtleastK == countLetters;
    }
}

// maxwindLen = r - l + 1 = 3
// window = {a: 3, b : 2}
// s =  "aaabb"

// wind = {
//     a: 2 , b: 3, c: 
// }
// maxwind = 4
//     r
// ababbc
// l
