class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        letters = set(s)
        ans = 0
        for letter in letters:
            #compute first and last occurance of that character and iterate over it to see elements are in bwtween so they all can be palindromes
            first_idx, last_idx = s.index(letter), s.rindex(letter)
            between = set()

            for k in range(first_idx + 1, last_idx):
                between.add(s[k])

            ans += len(between)

        return ans
        
