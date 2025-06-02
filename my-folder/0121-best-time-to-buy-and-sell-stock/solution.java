class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minBuy = Integer.MAX_VALUE;
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
