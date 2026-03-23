class Solution {
    public String maskPII(String s) {
        if (Character.isLetter(s.charAt(0))) {
            // EMAIL CASE
            s = s.toLowerCase();
            int atIndex = s.indexOf('@');
            
            String name = s.substring(0, atIndex);
            String domain = s.substring(atIndex);
            
            return name.charAt(0) + "*****" + name.charAt(name.length() - 1) + domain;
        } else {
            // PHONE CASE
            
            String digits = "";
            for (char ch : s.toCharArray()) {
                if (Character.isDigit(ch)) {
                    digits += ch;
                }
            }
            
            String local = "***-***-" + digits.substring(digits.length() - 4);
            
            int countryLength = digits.length() - 10;
            
            if (countryLength == 0) {
                return local;
            }
            
            String country = "+";
            for (int i = 0; i < countryLength; i++) {
                country += "*";
            }
            
            return country + "-" + local;
        }
    }
}
