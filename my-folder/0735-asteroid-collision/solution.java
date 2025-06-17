class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int asteroid:asteroids){
            boolean destroyed = false;
            while(!stack.isEmpty() && asteroid < 0 && stack.peekLast() > 0){
                int top = stack.peekLast();
                if(top < -asteroid){
                    stack.pollLast();
                }
                else if(top == -asteroid){
                    stack.pollLast();
                    destroyed = true;
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            } 

            if(!destroyed){
                stack.offerLast(asteroid);
            }  
        }

        int[] result = new int[stack.size()];
        int i = 0;
        for (int val : stack) {
            result[i++] = val;
        }
        return result;
    
    }
}
// only when stack is empty then add negative ones to stack else check top of stack and if less dont insert if greater pop element from stack.
// if greater keep the element and check the next top of the stack if that is also small pop do it until either of it pops 

