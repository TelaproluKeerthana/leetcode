class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuffer res = new StringBuffer();
        for(String word : words){
            int curr = 0;
            for(int i = 0; i < word.length(); i++){
                curr += weights[word.charAt(i) - 'a'];
            }

            res.append((char) ('z' - (curr % 26)));
        }

        return res.toString();
    }
}
