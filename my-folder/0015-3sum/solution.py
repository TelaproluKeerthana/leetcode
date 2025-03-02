class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        length=len(nums)
        nums.sort()
        res = []
        for i in range(length-2):
            if i>0 and nums[i-1] == nums[i]:
                continue

            left, right = i+1, length-1
            while (left < right):

                three_sum = nums[i] + nums[left] + nums[right]
                
                if(three_sum > 0):
                    right -= 1
                elif(three_sum < 0):
                    left += 1
                else:
                    res.append([nums[left],nums[right], nums[i]])
                    while left < right and nums[left] == nums[left + 1]:
                        left +=1
                    while left < right  and nums[right] ==  nums[right - 1]:
                        right -=1
                    left += 1
                    right -= 1
        
        return res



        # hm=defaultdict()
        # res=[]
        # tripset = set()
        # for i in range(len(nums)-2):
        #     a = nums[i]
        #     for j in range(i+1,len(nums)-1):
        #         b = nums[j]
        #         for k in range(j+1,len(nums)): 
        #             c = nums[k]
        #             if(a + b + c == 0):
        #                 triplet=tuple(sorted([a,b,c]))
        #                 if triplet not in tripset:
        #                     res.append([a,b,c])
        #                     tripset.add(triplet)
        # return res

            
