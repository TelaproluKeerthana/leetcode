class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        count_whites = 0
        min_recolors = float("inf")
        l = 0
        
        for r in range(len(blocks)):
            if (blocks[r] == "W"):
                count_whites += 1
            if (r - l + 1 == k):
                min_recolors = min(min_recolors, count_whites)
                if blocks[l] == "W":
                    count_whites -= 1
                l += 1
    
        return min_recolors

# count = 1
# mincount = 1        
# WBWBBBW  
#  k = 7
#  windsize = r - l + 1  > k
#  WBBWWBBWBW
#    l
#           r

# countwhites = 4
# no of whites = min(no of whites, count_whites)
# no of white = 3
