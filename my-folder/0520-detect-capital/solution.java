class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;

        char curr = word.charAt(0);
        boolean lowercase = true;
        if((word.charAt(0) >= 65 && (int)curr <= 90) && (Character.isLowerCase(word.charAt(1)))){
            lowercase = true;
        }
        else if((int)curr >= 65 && (int)curr <= 90){
            lowercase = false;
        }
        else{
            lowercase = true;
        }

        for(int i = 1; i < word.length(); i++){
            char c = word.charAt(i);
            if(lowercase == true){
                if(lowerCaseBounds(c)) continue;
                else return false;
            }
            else{
                if(upperCaseBounds(c)) continue;
                else return false;
            }
        }

        return true;  
    }

    public boolean lowerCaseBounds(char c){
        if((int) c >= 97){
            return true;
        }
        return false;
    }
    public boolean upperCaseBounds(char c){
        if((int) c >= 65 && (int) c <= 90){
            return true;
        }
        return false;
    }
}
