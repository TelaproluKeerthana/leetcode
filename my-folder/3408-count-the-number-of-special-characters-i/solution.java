class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        int total = 0;
        for(char c : word.toCharArray()){
            set.add(c);
        }

        for(char c = 'a'; c  <= 'z'; c++){
            if(set.contains(c) && set.contains((char) (c - 'a' + 'A'))){
                total++;
            }

        }

        return total;
    }
}
