class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res = []
        partition = []

        def is_pali(s,i,j):
            while i < j :
                if s[i] != s[j]:
                    return False
                i, j = i + 1, j - 1
            return True

        def dfs(i):
            if (i >= len(s)):
                res.append(partition.copy())
                return
            
            for j in range(i, len(s)):
                if is_pali(s, i, j):
                    partition.append(s[i: j+1])
                    dfs(j + 1)
                    partition.pop()
        dfs(0)
        return res
        
        


#s.length could be 16
# s = "aab"
# [[a,a,b], [aa, b]]

        
