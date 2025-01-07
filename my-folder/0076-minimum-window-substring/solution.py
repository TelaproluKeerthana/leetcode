class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "":
            return ""

        county={}
        for c in t:
            county[c]=1+county.get(c,0)

        need=len(county)
        have=0
        wind={}
        l=0
        res,reslen=[-1,-1],float("inf")

        for i in range(len(s)):
            c=s[i]
            wind[c]=1+wind.get(c,0)
            if c in county and wind[c]==county[c]:
                have+=1
            while have==need:
                if(i-l+1)<reslen:
                    res=[l,i]
                    reslen=i-l+1
                wind[s[l]]-=1
                if s[l] in county and wind[s[l]]<county[s[l]]:
                    have-=1
                l+=1
        l,i=res
        return s[l:i+1] if reslen != float("inf") else ""
        
