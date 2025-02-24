class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        if len(nums2)==1:
            return [-1]
        res=[-1]*len(nums1)
        hm={val:i for i,val in enumerate(nums2)}
        for i,num in enumerate(nums1):
            j=hm[num]+1            
            while(j<len(nums2)):
                if num<nums2[j]:
                    res[i]=nums2[j]
                    break
                j+=1
        return res
        
# [4,1,2], [1,3,4,2]  need=2 2+1<=4
#  i


        
