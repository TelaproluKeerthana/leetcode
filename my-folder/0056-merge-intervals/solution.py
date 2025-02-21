class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        # if len(intervals)==1:
        #     return intervals
        intervals.sort(key=lambda x:x[0])
        res=[intervals[0]]
        for start,end in intervals[1:]:
            prev=res[-1][1]
            if prev>=start:
                res[-1][1]=max(prev,end)
            else:
                res.append([start,end])
        return res

            


        
