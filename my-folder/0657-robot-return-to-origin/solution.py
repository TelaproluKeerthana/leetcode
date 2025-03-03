class Solution:
    def judgeCircle(self, moves: str) -> bool:
        r, c = 0, 0
        ir, ic = r, c
        for i in moves:
            if i == 'R':
                c += 1
            elif i == 'L':
                c -= 1
            elif i == 'D':
                r += 1
            elif i == 'U':
                r -= 1
        return r == ir and c == ic

        
