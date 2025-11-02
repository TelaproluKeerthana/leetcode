class Solution {
    public boolean isAlienSorted(String[] words, String order) {
      Map<Character, Integer> orderDict = new HashMap<>();
      for(int i = 0; i < order.length(); i++){
        char curr = order.charAt(i);
        orderDict.put(curr, i);
      }

        for(int i = 0; i < words.length - 1; i++){
            if(!isInCorrectOrder(words[i], words[i + 1], orderDict)){
                return false;
            }   
        }

        return true;
      }  

    private boolean isInCorrectOrder(String word1, String word2, Map<Character, Integer> orderDict){
        int len = Math.min(word1.length(), word2.length());
        for(int i = 0; i < len; i++){
            char c1  = word1.charAt(i);
            char c2 = word2.charAt(i);
            if(c1 != c2){
                return orderDict.get(c1) < orderDict.get(c2);
            }
        }
        return word1.length() <= word2.length(); 
    }
}


// char prev = word.charAt(i - 1);
//             char curr = word.charAt(i);
//             if(orderDict.)
