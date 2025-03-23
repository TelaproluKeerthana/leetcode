class Solution:

    def getRow(self, rowIndex: int) -> List[int]:
        arr = self.generateRows(rowIndex)
        return arr
    
    def generateRows(self, rowIndex):
        prev = [1]
        for r in range(rowIndex):
            new_row = [1]
            for c in range(len(prev) - 1):
                new_row.append(prev[c] + prev[c + 1])
            new_row.append(1)
            prev = new_row
            
        return prev




                

            


