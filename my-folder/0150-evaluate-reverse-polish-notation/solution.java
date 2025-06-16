class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            String curr = tokens[i];
            if(curr.equals("*")){
                int divisor = stack.pop();
                int dividend = stack.pop();
                stack.push(dividend * divisor);
            }
            else if(curr.equals("/")){
                int divisor = stack.pop();
                int dividend = stack.pop();
                stack.push(dividend / divisor);
            }
            else if(curr.equals("-")){
                int divisor = stack.pop();
                int dividend = stack.pop();
                stack.push(dividend - divisor);
            }
            else if(curr.equals("+")){
                int divisor = stack.pop();
                int dividend = stack.pop();
                stack.push(dividend + divisor);
            }
            else{
                stack.push(Integer.parseInt(curr));
            }
        }

    return stack.peek();
    }
}
