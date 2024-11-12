class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numset={}
        for i in range(len(nums)):
            find=target-nums[i]
            if find in numset:
                return i,numset[find]
            numset[nums[i]]=i

        
