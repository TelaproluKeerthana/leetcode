class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        #create a dp array 
        # dp=[False]*(len(s)+1)
        # dp[0]=True
        words = set(wordDict)
        # for start in range(1, len(s) + 1):
        #     for end in range(0, start):
        #         if (dp[end] and s[end : start] in words):
        #             dp[start] = True
        #             break
        # return dp[len(s)]

        queue = deque([0])
        seen = set()
        while queue:
            start = queue.popleft()
            if start == len(s):
                return True
                # queue is to keep track of the position until which we can break words 
            
            for end in range(1, len(s) + 1):
                if end in seen:
                    continue

                if s[start : end] in words:
                    queue.append(end)
                    seen.add(end) #we add elements to seen so we dont have to compute we we see it again
        return False #when we couldn't reach the last index and we don't have any elements in queue, then we break out of loop

    
