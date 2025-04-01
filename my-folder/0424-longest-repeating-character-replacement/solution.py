from collections import defaultdict
class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        L = 0  
        counter = defaultdict(int)
        longest_substring = 0
        maxFreq = 0
        for R in range(len(s)):
            counter[s[R]] += 1
            maxFreq = max(maxFreq, counter[s[R]])
            while(R - L + 1 - maxFreq > k):
                counter[s[L]] -= 1
                L += 1
            longest_substring = max(R - L + 1, longest_substring)
      
        return longest_substring

        

            
            

            


        
