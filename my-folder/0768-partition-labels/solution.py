class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        hm={}
        for  i in range(len(s)):
            hm[s[i]]=i
    
        res=[]
        l,r=0,0
        for i,c in enumerate(s):
            r=max(r,hm[c])
            if(i==r):
                res.append(r-l+1)
                l=r+1
        return res
        


# approach:
# s= ababcbacadefegdehijhklij

# 1. occurances of a char in be just one part
# 2. if we make one partition then other partition should not have that number
# 3. if making partition isn't possible return the actual length of the string

# step 1: iterate over the elements and make key-val pairs
#  - key should be the distinct elements
#  - iterate until there is a different element that shows up, add len of that part until a new character is present to the res arr and i.

''' input 
s = "ababcbacadefegdehijhklij"
                            
    i=23
hm= 
    { 
        a:8
        b:5
        c:7
        d:14
        e:15
        f:11
        g:13
        h:19
        i: 22
        j: 23
        k: 20
        l: 21
    }
hm2={

}
largest
ababcbaca            defegde hijhklij
l       r     rl=r+1  10 
two pointers l ,r
'''






 
        
