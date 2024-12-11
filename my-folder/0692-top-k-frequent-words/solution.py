class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        hm=Counter(words)
        print(hm)
        return [item[0] for item in sorted(hm.items(), key=lambda x: (-x[1], x[0]))[:k]]
        
