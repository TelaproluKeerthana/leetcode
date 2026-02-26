class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        StringBuilder updated = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr != '-') {
                updated.append(Character.toUpperCase(curr));
            }
        }
        
        int length = updated.length();
        if (length == 0) return "";

        StringBuilder sb = new StringBuilder();
        
        int firstGroupLength = length % k;
        
        int index = 0;
        
        if (firstGroupLength > 0) {
            for (int i = 0; i < firstGroupLength; i++) {
                sb.append(updated.charAt(index++));
            }
             if (index < length) {
                sb.append("-");
            }
        }
        
        
        while (index < length) {
            for (int i = 0; i < k; i++) {
                sb.append(updated.charAt(index++));
            }
            
            if (index < length) {
                sb.append("-");
            }
        }
        
        return sb.toString();
    }
}
