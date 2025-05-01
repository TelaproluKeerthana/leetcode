class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        count = 0
        for idx, word1 in enumerate(words):
            for word2 in words[idx + 1:]:
                if self.isPrefixAndSuffix(word1, word2):
                    count += 1

        return count

    def isPrefixAndSuffix(self, str1, str2):
        if str1 == "" or str2 == "":
            return True
        
        if str2.startswith(str1) and str2.endswith(str1):
            return True
        
        return False
        

        
