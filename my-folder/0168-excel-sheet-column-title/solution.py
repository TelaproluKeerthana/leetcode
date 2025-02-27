class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        # hm={}
        # for i in range(65,90+1):
        #     hm[(i%65)+1]=i
        s=''
        while(columnNumber>0):
            columnNumber-=1
            s=chr( columnNumber%26 + ord('A') ) + s
            columnNumber//=26
        return s
        
        
