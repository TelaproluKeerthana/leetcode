class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        output = []
        rows = len(matrix)
        cols = len(matrix[0])
        for col in range(cols):
            for row in range(rows - 1, -1, -1):
                output.append(matrix[row][col])
        idx = 0
        for row in range(rows):
            for col in range(cols):
                matrix[row][col] = output[idx]
                idx += 1
        
        



        
