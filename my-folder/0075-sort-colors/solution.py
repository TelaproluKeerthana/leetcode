class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # dutch national flag algorithm 
        freq_counter = [0] * 3
        for i in range(len(nums)):
            freq_counter[nums[i]] += 1
        
        idx = 0
        for curr in range(len(freq_counter)):
            while(freq_counter[curr] > 0 and idx < len(nums)):
                nums[idx] = curr
                idx += 1
                freq_counter[curr] -= 1

        print(nums)
            
        


            
        

            

# [2,0,2,1,1,0]
#  l r

