class Solution:

    def getRow(self, rowIndex: int) -> List[int]:
        # base case
        arr = [[1]]        
        for row in range(1, rowIndex + 1):
            prev = arr[-1]
            new_col = [1]
            for col in range(len(prev) - 1):
                new_col.append(prev[col] + prev[col + 1])
            new_col.append(1)
            arr.append(new_col)

        return arr[-1]
                

            


