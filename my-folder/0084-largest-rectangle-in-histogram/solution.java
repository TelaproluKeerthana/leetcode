class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] lheights = new int[len];
        int[] rheights = new int[len];
        Stack<Integer> stack = new Stack<>();
        
        // prefix array checking the min of the element to the left 
        for(int i = 0; i < len; i++){
            int curr = heights[i];
            lheights[i] = -1;
            while(!stack.isEmpty() && heights[stack.peek()] >= curr){
                stack.pop();               
            }
            if(!stack.isEmpty()){
                lheights[i] = stack.peek();
            }
            stack.push(i);
        }
        
        stack.clear();

        // suffix arrray checking the min element from  the right
        for(int i = len - 1; i >= 0; i--){
            int curr = heights[i];
            rheights[i] = len;
            while(!stack.isEmpty() && heights[stack.peek()] >= curr){
                stack.pop();
            }
             if(!stack.isEmpty()){
                rheights[i] = stack.peek();
            }
            stack.push(i);

        }

        int maxArea = 0;
        for (int i = 0; i < len; i++) {
            lheights[i] += 1;
            rheights[i] -= 1;
            maxArea = Math.max(maxArea, heights[i] * (rheights[i] - lheights[i] + 1));
        }
        return maxArea;         
    }
}
// 2(pop) 1 5(pop) 6(pop) 2 3
        // l[] = [2, -1, 1, 5, 1, 2]
                         
        // stack = [3(pop), 2(pop), 6(pop), 5(pop), 1, 2]
        // r[] = [1, 7, 2, 2, 7, 7]
        //    r[] = [1, 7, 4, 4, 7, 7]
        //    l[] = [-1, -1, 1, 2, 1, 5]
        // maxArea(2) = 2 * 0 - 0 + 1 = 2
        //         = 1 * 3 - 2 + 1 = 2
        //         = 5 * 6 - 5 + 1 = 10
        //         = 6 * 5 - 5 + 1 = 6
        //         = 2  = 2
        //         = 3 * (3 - 3 + 1) = 3 
