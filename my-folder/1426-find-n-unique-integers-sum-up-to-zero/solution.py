class Solution:
    def sumZero(self, n: int) -> List[int]:
        flag = False
        # if even you need to add some
        if n % 2 != 0:
            flag = True
        
        res = []

        if flag:
            res.append(0)

        for i in range(n // 2):
            res.append(i + 1)
            res.append(-(i + 1))

        
        return res
            

        






        
