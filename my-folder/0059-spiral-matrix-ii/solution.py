class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        l = 0 
        r = n - 1
        top = 0
        bot = n - 1
        res=[[0] * n for _ in range(n)]
        curr = 1

        while l <= r and top <= bot:
            for i in range(l, r + 1):
                res[top][i] = curr
                curr += 1
            top += 1
            for i in range(top , bot + 1):
                res[i][r] = curr 
                curr += 1
            r -= 1
            if not (l <= r  and top <= bot):
                break
            for i in range(r , l - 1, -1):
                res[bot][i] = curr
                curr += 1
            bot -= 1
            for i in range( bot, top - 1, -1):
                res[i][l] = curr
                curr += 1
            l += 1

        return res

