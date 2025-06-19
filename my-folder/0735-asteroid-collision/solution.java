class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // picking a datastructure can be anything, your choice can use stack or deque or even with an array
        Deque<Integer> stack = new ArrayDeque<>();
        for(int asteroid:asteroids){
            boolean destroyed = false;
            while(!stack.isEmpty() && stack.peekLast() > 0 && 0 > asteroid){
                int top = stack.peekLast();
                if(top < -asteroid){
                    // when the asteroid is heavier than the top the top of stack explodes
                    stack.pollLast();
                }
                else if(top == -asteroid){
                   // when the top and asteroid are travelling towards each other and are of same size
                    stack.pollLast();
                    destroyed = true;
                    break;
                }
                else{
                    // when the asteroid is smaller than the top of the stack and is negative that will be destroyed, so update flag so you dont append it to the stack
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
        for(int val:stack){
            result[i++] = val;
        }

        return result;
    }
}
