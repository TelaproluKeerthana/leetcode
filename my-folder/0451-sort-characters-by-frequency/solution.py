class Solution:
    def frequencySort(self, s: str) -> str:
        freq_s = defaultdict(int)
        for char in s:
            freq_s[char] += 1

        sorted_decr_freq = []

        for key,val in freq_s.items():
            sorted_decr_freq.append((-val,key))
        
        heapq.heapify(sorted_decr_freq)
        
        res = []
        while sorted_decr_freq:
            freq, curr = heapq.heappop(sorted_decr_freq)
            res.append(curr * (-1 * freq))

        return "".join(res)

        


        
        
        print(freq_s)
        
