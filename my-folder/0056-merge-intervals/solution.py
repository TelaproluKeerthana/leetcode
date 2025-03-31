class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if len(intervals) == 1:
            return [intervals[0]]
        intervals.sort(key= lambda x: x[0])
        output = [intervals[0]]
        for start, end in intervals[1:]:
            prev_end = output[-1][1]
            if start <= prev_end:
                end = max(end, prev_end)
                output[-1][1] = end
            else:
                output.append([start, end])

        return output

# # [[1,3], [2,6], [8,10], [15,18]]
#                   start,end

# output = [[1,6], [8,10],[15, 18]]
# 8 < 6 
# end = (6, 3)
# output[-1][1] = 10



        
