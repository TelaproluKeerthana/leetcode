class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1Hash = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
    
        for(char c: s1.toCharArray()){
            s1Hash.put(c, s1Hash.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        for(int right = 0; right < s2.length(); right++){
            char curr = s2.charAt(right);
            window.put(curr, window.getOrDefault(curr, 0) + 1);
            while(right - left + 1 > s1.length()){
                char leftChar = s2.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
                left++;
            }

            if(window.equals(s1Hash)) return true;
            
        }
        
        return false;
    }
}
