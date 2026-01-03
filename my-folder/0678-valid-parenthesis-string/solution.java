class Solution {
    public boolean checkValidString(String s) {
        int openCount = 0;
        int closeCount = 0;

        int len = s.length() - 1;

        for(int i = 0; i <= len; i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '*'){
                openCount++;
            }
            else{
                openCount--;
            }
            
            if(s.charAt(len - i) == ')' || s.charAt(len - i) == '*'){
                closeCount++;
            }
            else{
                closeCount--;
            }

            if(openCount < 0 || closeCount < 0){
                return false;
            }
        }

        return true;
    }
}

// (*))
// i  j
// oc = 0
// cs = 2
// its balanced.

