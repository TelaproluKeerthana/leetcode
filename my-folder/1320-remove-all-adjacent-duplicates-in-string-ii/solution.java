class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stk.isEmpty() && stk.peek()[0] == c){
                stk.peek()[1]++;
                if(stk.peek()[1] == k){
                    stk.pop();
                }
            }
            else{
                stk.push(new int[]{c, 1});
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int[] pair : stk){
            for(int i = 0; i < pair[1]; i++){
                sb.append((char)pair[0]);
            }
        }

        return sb.toString();
    }
}

// stack = [[d,1]pop, [e, 1](pop), [e, 2](pop), [d, 2]pop, [b, 1]pop, [b, 2]pop, [c, 1]pop, [c,2]pop, [a, 1], [a, 2]]
// s = deeedbbcccbdaa
//                i

// curr = e
// stack.peek()[0] == curr and stack.peek()[1] + 1 == k? pop k - 1 times from stack
// stack.peek()[0] == curr and stack.peek()[1] + 1 != k? stack.push(curr, stack.peek()[1] + 1)
// if none of those of true push element and count
