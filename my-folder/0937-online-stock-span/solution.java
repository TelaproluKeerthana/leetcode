class StockSpanner {
    private int[] stockprices;
    private int index;
    
    public StockSpanner() {
        stockprices = new int[10000];
        index = -1;
    }
    
    public int next(int price) {
        stockprices[++index] = price;
        int span = 1;
        for(int i = index - 1; i >= 0; i--){
            if(stockprices[i] <= price) span += 1;
            else break;
        }

    return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
