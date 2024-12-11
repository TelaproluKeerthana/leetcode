class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hm={}
        for i in nums:
            hm[i]=hm.get(i,0)+1
        freq=[[] for i in range(len(nums)+1)] #because numbers starts from 1
        print(freq)
        for j,num in hm.items():
            freq[num].append(j)
        
        res=[]
        for i in range(len(freq)-1,0,-1):
            for num in freq[i]:
                res.append(num)
                if len(res)==k:
                    return res
            
        
