class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> freqCounter = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(freqCounter.get(curr) == null){
                freqCounter.put(curr, 1);
            }
            else{
                freqCounter.put(curr, freqCounter.get(curr) + 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(freqCounter.get(curr) == 1){
                return i;
            }
        }

        return -1;
        
    }
}
