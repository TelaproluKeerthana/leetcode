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
