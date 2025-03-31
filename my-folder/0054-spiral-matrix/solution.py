class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        output = []
        max_rows = len(matrix) - 1
        max_cols = len(matrix[0]) - 1
        curr_row = 0
        curr_col = 0
        while curr_row <= max_rows and curr_col <= max_cols:
            
            for c in range(curr_col, max_cols + 1):
                output.append(matrix[curr_row][c])
            
            curr_row += 1

            for r in range(curr_row, max_rows + 1):
                output.append(matrix[r][max_cols])

            max_cols -= 1

            if not (curr_row <= max_rows and curr_col <= max_cols):
                break

            for c in range(max_cols, curr_col - 1, -1):
                output.append(matrix[max_rows][c])
            
            max_rows -= 1
            
            for r in range(max_rows, curr_row - 1, -1):
                output.append(matrix[r][curr_col])
            
            curr_col += 1

        return output
        
