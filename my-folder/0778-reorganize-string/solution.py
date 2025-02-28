class Solution:
    def reorganizeString(self, s: str) -> str:
        if len(s)==1:
            return s
        freq_s=Counter(s)
        #use maxheap to get the priority element
        maxHeap=[[-cnt,char] for char,cnt in freq_s.items()]
        prev=None
        res=""
        heapq.heapify(maxHeap)
        while prev or maxHeap:
            if prev and not maxHeap:
                return ""
            
            cnt,char=heapq.heappop(maxHeap)
            res+=char
            cnt+=1
            if prev:
                heapq.heappush(maxHeap,prev)
                prev=None
            if cnt!=0:
                prev=[cnt,char]
        return res




        
