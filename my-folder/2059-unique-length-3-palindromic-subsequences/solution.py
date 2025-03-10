class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        letters = set(s)
        ans = 0
        for letter in letters:
            first_idx, last_idx = s.index(letter), s.rindex(letter)
            between = set()

            for k in range(first_idx + 1, last_idx):
                between.add(s[k])

            ans += len(between)
            
        return ans
        
