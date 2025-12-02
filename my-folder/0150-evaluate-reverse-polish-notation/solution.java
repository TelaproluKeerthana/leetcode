class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(!token.equals("*") && !token.equals("+")  && !token.equals("-")  && !token.equals("/")){
                stack.push(Integer.parseInt(token));
            }
            else{
                int res = 0;
                int op1 = stack.pop();
                int op2 = stack.pop();
                if(token.equals("+")){
                    res += op1 + op2;
                }
                else if(token.equals("-")){
                    res += op2 - op1;
                }
                else if(token.equals("*")){
                    res += op1 * op2;
                }
                else if(token.equals("/")){
                    res += op2 / op1;
                }
                stack.push(res);
            }
        }

        return stack.pop();
    }
}
