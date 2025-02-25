class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        def nextIndex(str,ind):
            bkspc=0
            while(ind>=0):
                if(bkspc==0 and str[ind]!="#"):
                    break
                elif(str[ind]=="#"):
                    bkspc+=1
                else:
                    bkspc-=1
                ind-=1
            return ind
                

        index_s=len(s)-1
        index_t=len(t)-1
        while index_s>=0 or index_t>=0:
            index_s = nextIndex(s,index_s)
            index_t = nextIndex(t,index_t)
            char_s =s[index_s] if index_s>=0 else ""
            char_t=t[index_t] if index_t>=0 else ""
            if char_s!=char_t:
                return False
            index_s-=1
            index_t-=1
        return True

