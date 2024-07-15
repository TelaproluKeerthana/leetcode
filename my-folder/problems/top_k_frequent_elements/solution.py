class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter={}
        freqcounter=[[]for i in range(len(nums)+1)]
        for i in nums:
            counter[i]=1+counter.get(i,0)
        for i,n in counter.items():
            freqcounter[n].append(i)
        res=[]
        for i in range(len(freqcounter)-1,0,-1):
            for j in freqcounter[i]:
                res.append(j)
                if len(res)==k:
                    return res


        
        