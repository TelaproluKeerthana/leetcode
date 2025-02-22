class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        p=1
        mini=prices[0]
        maxProfit=0
        while p<len(prices):
            if(prices[p]<mini):
                mini=prices[p]
            elif (maxProfit<(prices[p]-mini)):
                maxProfit=prices[p]-mini
            p+=1
        return maxProfit

# prices = [7,1,5,3,6,4]
#                   p    
# mini=1
# maxp=5

