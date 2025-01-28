class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res=[]
        def combo(i,combs):
            if(len(combs)==k):
                res.append(combs.copy())
                return
            if i>n:
                return
            # combs.append(i)
            # combo(i+1,combs)
            # combs.pop()
            for j in range(i,n+1):
                combs.append(j)
                combo(j+1,combs)
                combs.pop()
        combo(1,[])
        return res

            


        
