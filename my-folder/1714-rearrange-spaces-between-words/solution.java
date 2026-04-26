class Solution {
    public String reorderSpaces(String text) {
        int totalSpaces = 0;
        for(char c : text.toCharArray()){
            if(c == ' '){
                totalSpaces += 1;
            }
        }
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;

        if (wordCount == 1) {
            return words[0] + " ".repeat(totalSpaces);
        }

        int spacesBetween = totalSpaces / (wordCount - 1);
        int endSpaces = totalSpaces % (wordCount - 1); 

        StringBuffer  sb = new StringBuffer();
        
        for (int i = 0; i < wordCount; i++) {
            sb.append(words[i]);
            if (i != wordCount - 1) {
                sb.append(" ".repeat(spacesBetween));
            }
        }
        sb.append(" ".repeat(endSpaces));

        return sb.toString();
    }
}
