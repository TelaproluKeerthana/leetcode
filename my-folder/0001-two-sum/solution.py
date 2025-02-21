class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm={val:i for i,val in enumerate(nums)}
        for i in range(len(nums)):
            req_val=target-nums[i]
            if req_val in hm and hm[req_val]!=i:
                return [i,hm[req_val]]

        



# hm={2:0,7:1,11:2,15:3}
# nums=[2,7,11,15]
#       i
# req_val =9-2 =7
# target-nums[i]=7
# hm[7]=1
              
# target=9

# [3,2,4] target =6
#  i
# hm[3:0,2:1,4:2]

# i!=hm[req] and target-nums[i] in hm


        
