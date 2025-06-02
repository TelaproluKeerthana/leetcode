class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Arrays.stream(prices).max().getAsInt();
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(minBuy > prices[i]){
                minBuy = prices[i];
            }
            profit = Math.max(profit, prices[i] - minBuy);
        }
        
        return profit;
    }
}
