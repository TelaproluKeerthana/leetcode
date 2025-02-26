class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        res=[False]*len(candies)
        max_candies=max(candies)
        for i in range(len(candies)):
            if (candies[i]+extraCandies>=max_candies):
                res[i]=True
        return res


        
