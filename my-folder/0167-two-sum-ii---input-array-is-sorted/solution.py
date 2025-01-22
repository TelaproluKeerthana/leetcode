class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        L=0
        R=len(numbers)-1
        while(L<R):
            mid=(numbers[L]+numbers[R])
            
            if(mid==target):
                return [L+1,R+1]
            elif mid<target:
                L+=1
            else:
                R-=1
        return [L+1,R-1]

            

        
