class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s_freq = new HashMap<>();
        for(char c : s.toCharArray()){
           s_freq.put(c, s_freq.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            if(!s_freq.containsKey(c)) return false;
            if(s_freq.get(c) == 0){
                return false;
            }
            s_freq.put(c, s_freq.get(c) - 1);
        }


        for(int val : s_freq.values()){
            if(val > 0) return false;
        }

        return true;
        
    }
}
