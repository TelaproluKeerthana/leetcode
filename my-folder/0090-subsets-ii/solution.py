class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        def generateSubsets(idx, currSubset):
            if(idx >= len(nums)):
                res.append(currSubset[:])
                return

            currSubset.append(nums[idx])
            generateSubsets(idx + 1, currSubset)

            currSubset.pop()
            while(idx + 1 < len(nums) and nums[idx] == nums[idx + 1]):
                idx += 1

            generateSubsets(idx + 1, currSubset)

        generateSubsets(0, [])
        return res

            






            
            

        
