class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_nums=Counter(nums)
        res=[(-val,ind) for ind,val in freq_nums.items()]
        heapq.heapify(res)
        output=[]
        while len(output)!=k:
            val,ind=heapq.heappop(res)
            output.append(ind)

        return output

# nums = [1,1,1,2,2,3], k = 2
#     1:3,2:2,3:1
#     minheap=(-3:1,-2,2,-1:1)
#     output: 1,2

