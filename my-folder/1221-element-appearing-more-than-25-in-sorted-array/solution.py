class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        freq=Counter(arr)
        need=len(arr)//4
        for key,val in freq.items():
            if val>need:
                return key
