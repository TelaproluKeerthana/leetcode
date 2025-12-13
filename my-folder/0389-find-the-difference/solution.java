class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> tfreq = new HashMap<>();
        for(char c : t.toCharArray()){
            tfreq.put(c, tfreq.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> sfreq = new HashMap<>();
        for(char c : s.toCharArray()){
            sfreq.put(c, sfreq.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : tfreq.entrySet()){
            char c = entry.getKey();
            int tcount = entry.getValue();
            int scount = sfreq.getOrDefault(c, 0);
            if(tcount != scount){
                return c;
            }
        }
    
        return ' ';
    }
}
