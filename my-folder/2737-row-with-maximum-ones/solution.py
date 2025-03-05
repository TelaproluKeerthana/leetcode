class Solution:
    def rowAndMaximumOnes(self, mat: List[List[int]]) -> List[int]:
        max_row = 0
        max_count = 0
        cols = len(mat[0])-1
        
        for i in range(len(mat)):
            col = 0
            c = 0
            while(col <= cols):
                if mat[i][col] == 1:
                    c += 1
                    if(c > max_count):
                        max_count = max(max_count,c) 
                        max_row = i
            
                col += 1

        return [max_row, max_count]        



        
