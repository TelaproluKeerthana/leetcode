class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals=sorted(intervals,key=lambda x:x[1])
        last_end=intervals[0][1]
        min_in=0
        length=1
        for i in range(len(intervals)):
            if(intervals[i][0]>=last_end):
                length+=1
                last_end=intervals[i][1]
        return (len(intervals)-length)


        