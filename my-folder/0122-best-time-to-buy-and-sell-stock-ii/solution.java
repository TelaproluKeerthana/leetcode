class Solution {
    public int maxProfit(int[] prices) {
        // Using the greedy algorithm to solve this
        int profit = 0;
        int idx = 1;
        int buy = prices[0];
        while(idx < prices.length){
            int curr = prices[idx];
            if(buy > curr){
                buy = curr;
                idx += 1;
            }
            else{
                profit += curr - buy;
                buy = curr;
                idx += 1;

            }
        }
        return profit;  
    }
}

// profit = 4 + 3
//idx = 1 
                //    curr
                //       b  i
// // [7, 1, 5, 3, 6, 4]
//        buy i
