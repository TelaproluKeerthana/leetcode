class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        row_flag = False
        col_flag = False
        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                if matrix[row][col] == 0:
                    if row == 0:
                        row_flag = True
                    if col == 0:
                        col_flag = True
                    elif row != 0 and col != 0:
                        matrix[row][0] = 0
                        matrix[0][col] = 0
        
        for row in range(1,len(matrix)):
            for col in range(1, len(matrix[0])):
                if matrix[row][0] == 0 or matrix[0][col] == 0:
                    matrix[row][col] = 0

        if row_flag:
            matrix[0] = [0] * len(matrix[0])
        
        if col_flag:
            for row in range(len(matrix)):
                matrix[row][0] = 0
            



        
        
