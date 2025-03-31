class Solution:
    def jump(self, nums: List[int]) -> int:
        dest = len(nums) - 1
        l = 0 
        r = 0
        minsteps = 0
        maxtravel = 0
        while (r < dest):
            for l in range(l, r + 1):
                maxtravel = max(nums[l] + l, maxtravel)

            l = r + 1
            r = maxtravel
            minsteps += 1

        return minsteps
         

            




        
