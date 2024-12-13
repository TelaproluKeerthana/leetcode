class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        #for rows
        for i in range(9):
            hm={}
            for j in range(9):
                if board[i][j]=='.':
                    continue
                hm[board[i][j]]=hm.get(board[i][j],0)+1
            for val in hm.values():
                if val>1:
                    return False
        #for columns
        for j in range(9):
            hm={}
            for i in range(9):
                if board[i][j]=='.':
                    continue
                hm[board[i][j]]=hm.get(board[i][j],0)+1
            for val in hm.values():
                if val>1:
                    return False
        #for 3*3 grid
        for row in range(3):
            for col in range(3):
                hm={}
                for i in range(row*3,(row+1)*3):
                    for j in range(col*3,(col+1)*3):
                        if board[i][j]=='.':
                            continue
                        hm[board[i][j]]=hm.get(board[i][j],0)+1
                    for val in hm.values():
                        if val>1:
                            return False
        return True
                
                


        
