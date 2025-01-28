class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        perms=[[]]
        for n in nums:
            np=[]
            for p in perms:
                for i in range(len(p)+1):
                    pcopy=p.copy()
                    pcopy.insert(i,n)
                    np.append(pcopy)
            perms=np
        return perms
        
