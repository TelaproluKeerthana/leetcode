class Solution:
    def frequencySort(self, s: str) -> str:
        freq_s = defaultdict(list)
        for char in s:
            if char in freq_s:
                freq_s[char] += 1
            else:
                freq_s[char] = 1

        sorted_decr_freq = []

        for key,val in freq_s.items():
            sorted_decr_freq.append((-val,key))

        
        heapq.heapify(sorted_decr_freq)
        
        res = ''
        while len(sorted_decr_freq) > 0:
            freq, curr = heapq.heappop(sorted_decr_freq)
            for _ in range(-1 * freq):
                res += curr

        return res

        


        
        
        print(freq_s)
        
