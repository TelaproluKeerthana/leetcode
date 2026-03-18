class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuffer sb = new StringBuffer();
        int op = 0;
        for(char curr : s.toCharArray()){
            if(curr == '('){
                op += 1;
                sb.append(curr);
            }   
            else if(curr == ')'){
                if( op > 0){
                    op -= 1;
                    sb.append(curr);
                }
            }
            else{
                sb.append(curr);
            }
        }

        StringBuilder result = new StringBuilder();
        // remove extra open paranthesis
        for(int i = sb.length() - 1; i >= 0; i--){
            char curr = sb.charAt(i);
            if(curr == '(' && op > 0){
                op--;
            }
            else{
                result.append(curr);
            }
        }

        return result.reverse().toString();
    }
}

// lee
// lee(t(c)o)de)
//      i
// op = 2 - 1 -1 = 0
// braces = (
