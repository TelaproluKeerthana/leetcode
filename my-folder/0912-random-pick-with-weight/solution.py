class Solution:

    def __init__(self, w: List[int]):
        self.prefixSum = [0] * len(w)
        self.curr_sum = 0
        for i in range(len(w)):
            self.curr_sum += w[i]
            self.prefixSum[i] = self.curr_sum
        # here the prefix sum gives us that the probability of picking that number

    def pickIndex(self) -> int:
        # if len(self.weights) == 1:
        #     return 0
        target = self.curr_sum * random.random()
        #generates 0 or curr_sum
        for i, psum in enumerate(self.prefixSum):
            if target < psum:
                return i
        
        
        


# Your Solution object will be instantiated and called as such:
# obj = Solution(w)
# param_1 = obj.pickIndex()
