class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        # return len(set(nums))==len(nums)
        freq_counter={}
        for i in range(len(nums)):
            if nums[i] not in freq_counter:
                freq_counter[nums[i]]=[i]
            else:
                freq_counter[nums[i]].append(i)
        for indices in freq_counter.values():
            if len(indices)>1:
                for i in range(1,len(indices)):
                    if((indices[i]-indices[i-1])<=k):
                        return True
        return False





        
