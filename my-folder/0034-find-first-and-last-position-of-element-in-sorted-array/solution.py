class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
        def findbound(isFirst):
            l = 0
            r = len(nums) - 1
            while l <= r:
                mid = (l + r) // 2
                if(nums[mid] < target):
                    l = mid + 1
                elif(target < nums[mid]):
                    r = mid - 1
                else:
                    if isFirst:
                        if mid == l or nums[mid - 1] < target:
                            return mid
                        r = mid - 1
                    else:
                        if mid == r or nums[mid + 1] > target:
                            return mid
                        l = mid + 1
            return -1

        lower_bound = findbound(True)
        if lower_bound == -1:
            return [-1, -1]
        
        upper_bound = findbound(False)

        return [lower_bound, upper_bound]
                         



            

        
