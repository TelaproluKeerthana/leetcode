class Solution:
    def wiggleSort(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        nums_sorted=sorted(nums)
        res=[]
        mid=len(nums)
        for i in range(1,mid,2):
            nums[i]=nums_sorted.pop()
        for i in range(0,mid,2):
            nums[i]=nums_sorted.pop()
           

        
