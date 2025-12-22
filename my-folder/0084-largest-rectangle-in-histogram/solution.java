class Solution {
    public int largestRectangleArea(int[] heights) {
         int n = heights.length;
        int[] leftMost = new int[n];
        int[] rightMost = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            leftMost[i] = -1;
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                leftMost[i] = stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        for(int i = n - 1; i >= 0; i--){
            rightMost[i] = n;
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                rightMost[i] = stack.peek();
            }

            stack.push(i);
        }

         int maxArea = 0;
        for (int i = 0; i < n; i++) {
            leftMost[i] += 1;
            rightMost[i] -= 1;
            maxArea = Math.max(maxArea, heights[i] * (rightMost[i] - leftMost[i] + 1));
        }
        return maxArea;
    }
}

// largestRect = 2

// heights = [2,1,5,6,2,3]
//                i
//         min(1, tos) = 2 + 1 = 4
//         add to stack
//         max(3, 5)
//         Math.max(prevRect, curr, min(curr, tos) * 2)
//         currMin = Math.min(x, x) = 1
// stack = [2 1 5 10]
           
// l = 5
// 2(5)
