class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        snums=sorted(nums)
        length=len(nums)
        l=0 
        r=0
        hm={}
        while(r<length):
            if(snums[r] not in hm):
                hm[snums[r]]=l
            r+=1
            if (r<length and snums[r-1]!=snums[r]):
                l=r

        return [hm[i] for i in nums] 


        
