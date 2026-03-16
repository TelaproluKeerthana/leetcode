class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> hmap = new HashMap<>();
        hmap.put(')', '(');
        hmap.put('}', '{');
        hmap.put(']', '[');


        for(char curr : s.toCharArray()){
            if(curr == '(' || curr == '{' || curr == '['){
                stack.add(curr);
            }
            else{
                if(stack.isEmpty() || stack.peek() != hmap.get(curr)){
                    return false;
                }
                else{
                    stack.pop();
                } 
            }
        }

        return stack.isEmpty() ? true : false;
    }
}
