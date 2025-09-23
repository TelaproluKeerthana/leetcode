class Solution {
    public int maxProfit(int[] prices) {
        // Using the greedy algorithm
        int totalProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int currPrice = prices[i];
            int prevPrice = prices[i - 1];
            if(currPrice > prevPrice){
                totalProfit += currPrice - prevPrice;
            }
        }

        return totalProfit;
    }
}

// profit = 4 + 3
//idx = 1 
                //    curr
                //       b  i
// // [7, 1, 5, 3, 6, 4]
//        buy i
