class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] array = s.toCharArray();
        for(char c:array){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
        }
    }
    String filtered = sb.toString();
    String reverseFiltered = sb.reverse().toString();
    return filtered.equals(reverseFiltered);
}
}
