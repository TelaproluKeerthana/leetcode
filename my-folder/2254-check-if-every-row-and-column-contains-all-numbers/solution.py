class Solution:
    def checkValid(self, matrix: List[List[int]]) -> bool:
        hm=defaultdict(set)
        row=defaultdict(set)
        col=defaultdict(set)

        for i in range(len(matrix)):
            for j in range(len(matrix)):
                if matrix[i][j] in row[i] or matrix[i][j] in col[j]:
                    return False
                col[j].add(matrix[i][j])
                row[i].add(matrix[i][j])
        return True


        
