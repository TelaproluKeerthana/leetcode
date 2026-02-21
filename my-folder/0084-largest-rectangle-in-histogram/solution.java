class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<List<Integer>> stack= new Stack<>();
        int maxArea = 0;
        for(int idx = 0; idx < heights.length; idx++){
            int currHeight = heights[idx];
            int start = idx;
            while(!stack.isEmpty() && stack.peek().get(1) > currHeight){
                List<Integer> top = stack.pop();
                int topIdx = top.get(0), topHeight = top.get(1);
                start = topIdx; // update the start as the next largest rectangle can start from this idx 
                maxArea = Math.max(maxArea, topHeight * (idx - topIdx));
            }
            stack.push(new ArrayList<>(List.of(start, currHeight)));
        }

        while(!stack.isEmpty()){
            List<Integer> top = stack.pop();
            int topIdx = top.get(0), topHeight = top.get(1);
            maxArea = Math.max(maxArea, (heights.length - topIdx) * topHeight);
        }

        return maxArea;
    }
}
// ma =  2, 6, 10

// stack = [[2, 0]pop,[0, 1], [2, 5]pop, [3, 6]pop, [4, 2], [5,3]]
// maxArea = 2 * (1 - 0)
// top = [3, 6]
// maxArea = 6 * (4 - 3) = 6 
// top = [2, 5]
// maxArea = 5 * (4 - 2) = 10
// stk =[[0, 1], [4,2], [5,3]]
// while (!stack.isEmpty())
// 1 * (6 - 0) = 6
// 2  * (4 - 6) = 4
// 3 * (6 - 5) = 3
// returns 10 at the end

// [2 1 5 6 2 3]
//  i
