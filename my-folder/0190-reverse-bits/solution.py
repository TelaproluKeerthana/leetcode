class Solution:
    def reverseBits(self, n: int) -> int:
        res = 0 
        # it will be 32 zeros
        for i in range(32):
            bit = (n >> i) & 1
            res = res | (bit << (31 - i))

        return res


        
