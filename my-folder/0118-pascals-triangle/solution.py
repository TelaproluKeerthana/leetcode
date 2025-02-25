class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        #base case
        list1=[[1]]

        for i in range(1,numRows):
            prev=list1[-1]
            newRow=[1]
            for j in range(len(prev)-1):
                newRow.append(prev[j]+prev[j+1])
            newRow.append(1)
            list1.append(newRow)
        return list1
        
