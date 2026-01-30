class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int top = stack.pop();
                result[top] = i - top; 
            }

            stack.push(i);
        }

    return result;
    }
}




// res = [1, 1, 4, 2, 1, 1, 0, 0]
//        73,74,75,71,69,72,76,73

// while(74 > temp[stack.peek()]) = 74 > 73 = currIdx - stack.peek() = 1-0

// res[0] = 1
// res[4] = 5  - 4
// res[3] = 5 - 3
// res[5] = 6 - 5
// res[2] = 6 - 2
// once you iterate over all numbers then you return 
// stk = [0(pop), 1(pop), 2(pop), 3(pop), 4(pop), 5(pop), 6]
                     








