class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        #create a dp array 
        dp=[False]*(len(s)+1)
        dp[0]=True
        words = set(wordDict)
        for start in range(1, len(s) + 1):
            for end in range(0, start):
                if (dp[end] and s[end : start] in words):
                    dp[start] = True
                    break
        return dp[len(s)]

    
