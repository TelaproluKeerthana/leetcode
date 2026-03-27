class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer>  tMap = new HashMap<>();
        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        
        Map<Character, Integer>  sMap = new HashMap<>();
        int need = tMap.size();
        int startPtr = 0;
        int l = 0;
        int maxLen = Integer.MAX_VALUE;
        int have = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            if(tMap.containsKey(c) && tMap.get(c).equals(sMap.get(c))){
                have++;
            }

            while(need == have){
                if(maxLen > r - l + 1){
                    maxLen = r - l + 1;
                    startPtr = l;
                }

                char lchar = s.charAt(l);
                sMap.put(lchar, sMap.getOrDefault(lchar, 0) - 1);
                if (tMap.containsKey(lchar) &&
                    sMap.get(lchar) < tMap.get(lchar)) {
                    have--;
                }

                l++;
            }
        }
         return maxLen == Integer.MAX_VALUE
            ? ""
            : s.substring(startPtr, startPtr + maxLen);
    }
}

// s = "ADOBECODEBANC", t = "ABC"
// start extending the window until the point we have all the elements with in t in s
// then start shrinking the window to see if we have all the elements within in t in s
// 

// s = "ADOBECODEBANC"
//      l
//           r

// A : 1
// B : 1
// C : 1
// maxlen = 6 stptr = 0 endptr = 5
