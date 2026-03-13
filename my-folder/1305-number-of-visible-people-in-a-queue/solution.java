class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            int c = 0;
            // check if tos is less than curr, meaning they cant block you from seeing others
            while(!stk.isEmpty() && heights[i] > stk.peek()){
                c+=1;
                stk.pop();
            }

            // if there are persons in the stack that are greater than curr persons height
            if(!stk.isEmpty()){
                c += 1;
            }
            
            result[i] = c;
            stk.push(heights[i]);
        }

        return result;
    }
}

// heights = [10,6,8,5,11,9] 
                 
