class MedianFinder:

    def __init__(self):
        self.maxi=[]
        self.mini=[]
        
    def addNum(self, num: int) -> None:
        if self.mini and num>self.mini[0]:
            heapq.heappush(self.mini,num)
        else:
            heapq.heappush(self.maxi,-1*num)
        if len(self.maxi)>len(self.mini)+1:
            val=heapq.heappop(self.maxi)
            heapq.heappush(self.mini,val*-1)

        elif len(self.mini)>len(self.maxi)+1:
            val=heapq.heappop(self.mini)
            heapq.heappush(self.maxi,-1*val)

    def findMedian(self) -> float:
        if len(self.mini)>len(self.maxi):
            return self.mini[0]
        elif len(self.maxi)>len(self.mini):
            return -1*self.maxi[0]

        else:
            return (self.mini[0]+-1*self.maxi[0])/2.0


# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()
