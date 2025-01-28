class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res=[]
        def combo(i,combs):
            if(len(combs)==k):
                res.append(combs.copy())
                return
            if i>n:
                return
            combs.append(i)
            combo(i+1,combs)
            combs.pop()
            combo(i+1,combs)
        combo(1,[])
        return res

            


        
