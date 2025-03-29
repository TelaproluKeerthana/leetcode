class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        visit = set()
        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                if matrix[row][col] == 0:
                    visit.add((row,col))
        
        
        for i in range(len(matrix)):
            for row,col in visit:
                matrix[i][col] = 0
        
        for j in range(len(matrix[0])):
            for row,col in visit:
                matrix[row][j] = 0
            



        
        
