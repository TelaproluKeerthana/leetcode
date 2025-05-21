class Solution {
    public String mergeAlternately(String word1, String word2) {
        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < lengthWord1 || i < lengthWord2){
            if(i <  lengthWord1) sb.append(word1.charAt(i));
            if(i < lengthWord2) sb.append(word2.charAt(i));
            i += 1;
        }

        // while(left < lengthWord1){
        //     sb.append(word1.charAt(left));
        //     left += 1;
        // }

        // while(right < lengthWord2){
        //     sb.append(word2.charAt(right));
        //     right += 1;
        // }
        
        return sb.toString();
    }
}
