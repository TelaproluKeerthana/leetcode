class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans=[0] * (2 * len(nums))
        # [ 0, 0, 0, 0, 0, 0]

        for i in range(len(ans)):
            # i -> 0 to 5
            ans[i] = nums[i % len(nums)]
            


           
            
        return ans

            
        