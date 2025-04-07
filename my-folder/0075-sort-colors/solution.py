class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        red = 0
        white = 0
        blue = len(nums) - 1
        #red pushes all the numbers greater than 0 to the right
        #blue moves ahead after setting all the 2's at the end of the array
        while white <= blue:
            if nums[white] == 0:
                nums[white], nums[red] = nums[red], nums[white]
                red += 1
                white += 1
            # only when the nums[white] is 1 then increment white this can be case where blue and white came to same position and we almost sorted  the array
            elif nums[white] == 1:
                white += 1 
            # when the nums[white] is 2 then we swap with blue decr blue 
            else:
                nums[white], nums[blue] = nums[blue], nums[white]
                blue -= 1
                
# [2,0,2,1,1,0]
#  l r

