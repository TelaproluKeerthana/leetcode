class Solution(object):
    def searchMatrix(self, matrix, target):
        rows,cols=len(matrix),len(matrix[0])
        r,c=0,cols-1
        while r<rows and c>=0:
            if matrix[r][c]>target:
                c-=1
            elif matrix[r][c]<target:
                r+=1
            else:
                return True
        return False



        
