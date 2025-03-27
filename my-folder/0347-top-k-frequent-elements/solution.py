class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count_frequencies = Counter(nums)
        lis_frequencies = []
        
        for val, freq in count_frequencies.items():
            lis_frequencies.append((-freq, val))

        heapq.heapify(lis_frequencies)
        output = []
        
        while k:
            freq, val = heapq.heappop(lis_frequencies)
            output.append(val)
            k -= 1
        
        return output 
        

         

        
