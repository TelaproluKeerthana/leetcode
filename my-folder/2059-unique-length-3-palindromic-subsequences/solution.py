class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        first_idx = [-1] * 26
        last_idx = [-1] * 26
        for i in range(len(s)):
            curr = ord(s[i]) - ord('a')
            if first_idx[curr] == -1:
                first_idx[curr] = i
            last_idx[curr] = i

        ans = 0 
        for i in range(26):
            #if there is no first element then you don't need to check if it's a palindrome as it doesn't exists
            if first_idx[i] == -1:
                continue
    
            between = set()
            for k in range(first_idx[i] + 1, last_idx[i]):
                between.add(s[k])

            ans += len(between)

        return ans
        
