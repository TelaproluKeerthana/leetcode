class Solution(object):
    def checkInclusion(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        c1={}
        for i in s1:
            c1[i]=1+c1.get(i,0)
        k=len(s1)
        c2={}
        L=0
        for R in range(len(s2)):
            c2[s2[R]]=1+c2.get(s2[R],0)
            while(R-L+1>k):
                c2[s2[L]]-=1
                if(c2[s2[L]]==0):
                    del c2[s2[L]]
                L+=1
            if(c1==c2):
                return True
        return False


        
        
