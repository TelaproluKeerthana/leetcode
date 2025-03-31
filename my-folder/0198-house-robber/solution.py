class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) <= 2:
            return max(nums)

        prev_rob = nums[0]
        curr_rob = max(nums[1], nums[0])
        for i in nums[2:]:
            temp = curr_rob
            curr_rob = max(curr_rob, prev_rob  + i)
            prev_rob = temp
        
        return curr_rob


        

        
