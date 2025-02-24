class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        # res=""
        for i in range(len(strs[0])):
            for s in strs:
                if i==len(s) or s[i]!=strs[0][i]:
                    return s[:i]
            # res+=prefix[i]
        return strs[0]

# prefix-flower
#        i
# strs=["flower","flow","flight"]
#          i        i      i x

        

        
