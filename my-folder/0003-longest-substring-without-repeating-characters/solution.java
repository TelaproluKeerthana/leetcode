class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxWind = 0;
        for(int right = 0; right < s.length(); right ++){
            char curr = s.charAt(right);
            while(window.contains(curr)){
                window.remove(s.charAt(left));
                left++;
            }
            
            window.add(curr);
            if(right - left + 1 > maxWind){
                maxWind = right - left + 1;
            }
        }

        return maxWind;
    }
}
