class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        if len(intervals) == 1:
            return 0
        intervals.sort()
        print(intervals)
        prev_end = intervals[0][1]
        count = 0
        for interval in intervals[1:]:
            if prev_end > interval[0]:
                count += 1
                prev_end = min(prev_end, interval[1])
            else:
                prev_end = interval[1]
        
        return count

# #[1,2]  [2,3]    [3,4]   [1,3]
#         interval
# count = 2
# prev = 4
