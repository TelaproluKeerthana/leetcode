class Solution:
    def climbStairs(self, n: int) -> int:
        if n==1 or n==2:
            return n
        prev=1
        curr=2
        for i in range(3,n+1):
            tmp=curr
            curr=prev+curr
            prev=tmp
            # dp[i]=dp[i-1]+dp[i-2]
        return curr

        
