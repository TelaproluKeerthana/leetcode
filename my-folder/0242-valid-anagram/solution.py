class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        count1 = Counter(s)
        count2 = Counter(t)
        for i in set(s):
            if count1[i] != count2[i]:
                return False
        return True

        # s_freqs={}
        # t_freqs={}
        # for i in s:
        #     if i not in s_freqs:
        #     # s_freqs[i]=s_freqs.get(i,0)+1
        #         s_freqs[i]=1
        #     s_freqs[i]+=1

        # for i in t:
        #     if i not in t_freqs:
        #     # t_freqs[i]=t_freqs.get(i,0)+1
        #         t_freqs[i]=1  
        #     t_freqs[i]+=1

        # return s_freqs==t_freqs
        if len(s)!=len(t):
            return False

        chars=set(s)
        for c in chars:
            if(s.count(c)!=t.count(c)):
                return False
        return True
            



        
