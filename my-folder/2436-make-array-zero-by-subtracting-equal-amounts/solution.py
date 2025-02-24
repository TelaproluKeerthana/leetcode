class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        
        counter=Counter(nums)
        res=[val for key,val in counter.items() if key!=0]
        # c=1+sum(n for n,count in counter.items() if count!=0) 
        return len(res)
