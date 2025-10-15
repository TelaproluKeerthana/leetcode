class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
             boolean destroy = false;
             // what cases causes destruction
             while(!stack.isEmpty() && asteroid < 0 && stack.peek() > 0){
                if(stack.peek() == -asteroid){
                    stack.pop();
                    destroy = true;
                    break;
                }
                else if(stack.peek() < -asteroid){
                    stack.pop();
                    continue;
                }
                else{
                    destroy = true;
                    break;
                }
             }

             if(!destroy){
                stack.push(asteroid);
             } 
        }

        int[] res = new int[stack.size()];
        int i = stack.size() - 1;
        while(i >= 0){
            res[i] = stack.pop();
            i--;
        }

        return res;
    }
}

// asteroids = [5,10,-5]
// check tos = 5 
// stack = [5]
