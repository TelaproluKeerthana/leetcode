class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # t=n
        
        # if len(nums1)==1 and len(nums2)==1:
        #     nums1[0]=max(nums1[0],nums2[0])
            
        # for i in range(n):
        #     nums1[i]=nums1[i]
        #     nums1[i+1]=nums1[t]
        #     t+=1
        # print(modified_nums1)
        for i in range(len(nums2)):
            nums1[i+m]=nums2[i]
        nums1.sort()


