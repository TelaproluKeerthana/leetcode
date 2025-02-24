class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        mergedstring=[]
        # minlen=min(len(word1),len(word2))
        i=0
        while len(word1)>i and len(word2)>i:
            mergedstring.append(word1[i])
            mergedstring.append(word2[i])
            i+=1
        while len(word1)>i:
            mergedstring.append(word1[i])
            i+=1
        while len(word2)>i:
            mergedstring.append(word2[i])
            i+=1
        return "".join(mergedstring) 


        
