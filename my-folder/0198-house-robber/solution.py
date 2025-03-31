class Solution:
    def rob(self, nums: List[int]) -> int:
        memo = [-1] * len(nums)
        # we are using -1 because we also have 0's in num indexes
        def dfs(curr_house):
            if curr_house >= len(nums):
                return 0

            if memo[curr_house] != -1:
                return memo[curr_house]

            memo[curr_house] = max(dfs(curr_house + 2) + nums[curr_house], dfs(curr_house + 1))

            return memo[curr_house]

        
        return dfs(0)

    # nums = [1,2,3,1]

# dfs(0) = max((dfs(2) + 1), dfs(1)) = 4
# dfs(2) = dfs(4) + 3, 1 = 3
# dfs(3) = 1
        
        



        # if len(nums) <= 2:
        #     return max(nums)

        # prev_rob = nums[0]
        # curr_rob = max(nums[1], nums[0])
        # for i in nums[2:]:
        #     temp = curr_rob
        #     curr_rob = max(curr_rob, prev_rob  + i)
        #     prev_rob = temp
        
        # return curr_rob


        

        
