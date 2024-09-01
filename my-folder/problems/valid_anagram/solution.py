class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        hash1={}
        hash2={}
        for i in s:
            if i in hash1:
                hash1[i]+=1
            else:
                hash1[i]=1
        for i in t:
            if i in hash2:
                hash2[i]+=1
            else:
                hash2[i]=1

        # for i in hash1:
        #     if(hash1[i]!=hash2[i]):
        #         return False
        # return (len(hash1.keys())==len(hash2.keys()))
        if( (len(hash1.keys())!=len(hash2.keys()))):
            return False
        for i in hash1:
            if(i not in hash2):
                return False
            if( hash1[i]!=hash2[i]):
                return False
        return True
        


                
    
