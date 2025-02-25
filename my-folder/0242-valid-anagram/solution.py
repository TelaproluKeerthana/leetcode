class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_freqs={}
        t_freqs={}
        for i in s:
            # if i in s_freqs:
            s_freqs[i]=s_freqs.get(i,0)+1
            #     s_freqs[i]+=1
            # s_freqs[i]=1

        for i in t:
            # if i in t_freqs:
            t_freqs[i]=t_freqs.get(i,0)+1
            #     t_freqs[i]+=1
            # t_freqs[i]=1
        return s_freqs==t_freqs


        
