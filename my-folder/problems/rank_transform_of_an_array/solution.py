class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        value_to_rank = {value: rank + 1 for rank, value in enumerate(sorted(set(arr)))}
        return [value_to_rank[value] for value in arr]
        