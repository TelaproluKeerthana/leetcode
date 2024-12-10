class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        h1={}
        h2={}
        for i in s:
            h1[i]=h1.get(i,0)+1 
        for j in t:
            h2[j]=h2.get(j,0)+1
        return h1==h2    
