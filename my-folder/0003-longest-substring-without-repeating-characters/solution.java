class Solution {
    public int lengthOfLongestSubstring(String s) {
     Set<Character> wind = new HashSet<>();
     int maxWind = 0;
     int l = 0;
     for(int r = 0; r < s.length(); r++){
        char curr = s.charAt(r);
        while(wind.contains(curr)){
            wind.remove(s.charAt(l));
            l++;
        }

        wind.add(curr);
        if(r - l + 1 > maxWind){
            maxWind = Math.max(r - l + 1, maxWind);
        }
    }   

    return maxWind;
    
    }
}

// abcabcbb
//    i
// maxwind = 3
// window = {a, b, c}

