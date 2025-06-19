class StockSpanner {
    Stack<int[]> stack = new Stack<>();
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int len = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
           len += stack.pop()[1];
        }

        stack.push(new int[]{price, len});
        return len;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
