class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals) == 1:
            return [intervals[0]]

        intervals.sort(key= lambda x: x[0])
        prev = intervals[0]
        output = []

        for interval in intervals[1:]:
            
            if interval[0] <= prev[1]:
                prev[1] = max(interval[1], prev[1])
            else:
                output.append(prev)
                prev = interval

        output.append(prev)
        return output

# # [[1,3], [2,6], [8,10], [15,18]]
#                   start,end

# output = [[1,6], [8,10],[15, 18]]
# 8 < 6 
# end = (6, 3)
# output[-1][1] = 10



        
