class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        curr_set = set()
        longest_substr = 0
        for r in range(len(s)):
            if s[r] not in curr_set:
                curr_set.add(s[r])
            else:
                while(s[r] in curr_set):
                    curr_set.remove(s[l])
                    l += 1
                curr_set.add(s[r])
            longest_substr = max(longest_substr, len(curr_set))
        
        return longest_substr
            


        
