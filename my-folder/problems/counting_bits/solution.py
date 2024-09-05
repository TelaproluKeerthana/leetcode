class Solution:
    def countBits(self, n: int) -> List[int]:
        mis=[0]*(n+1)

        for i in range(n+1):
            mis[i]=mis[i>>1]+(i&1)
        return mis
        