class Solution:
    def fib(self, n: int) -> int:
        if n==0 or n==1:
            return n
        # return self.fib(n-1)+self.fib(n-2)
        dp=[0,1]
        for i in range(2,n+1):
            tmp=dp[0]+dp[1]
            dp[0]=dp[1]
            dp[1]=tmp
        return dp[1]

        
