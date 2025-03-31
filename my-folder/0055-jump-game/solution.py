class Solution:
    def canJump(self, nums: List[int]) -> bool:
        goal = len(nums) - 1
        for i in range(len(nums) - 2, -1, -1):
            if nums[i] + i >= goal:
                goal = i
        
        return goal == 0


            

            
# 2,3,1,1,4
# initial_pos = 0 ,val = 2
# val = max(arr[0 + 1 : val + 1])
# pos = 1 


        
