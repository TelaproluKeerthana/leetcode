class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        for i in range(len(haystack)):
            if haystack[i]==needle[0]:
                if haystack[i:i+len(needle)]==needle:
                    return i
        return -1
        # if not needle:
        #     return 0
        # l=0
        # needle_len=len(needle)
        # for r in range(len(haystack)):
        #     if haystack[r]==needle[l]:
        #         l+=1
        #         if(l==needle_len):
        #             return (r-needle_len+1)
        #     else:
        #         if l>0:
        #             r-=l
        #             l=0
        # return -1
            
# haystack = "sadbutsad"
#              r
#  needle = "sad"
#             l



        
