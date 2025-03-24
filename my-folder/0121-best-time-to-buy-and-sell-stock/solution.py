class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice = prices[0]
        maxProfit = 0
        
        for i in range(1, len(prices)):
            if prices[i] < minPrice:
                minPrice = prices[i]
            maxProfit = max(maxProfit, prices[i] - minPrice)
        
        return maxProfit

# prices = [7,1,5,3,6,4]     
#                 i
# minprice = 1
# maxprofit = 5


