class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        curr_idx = 0
        total_intervals = len(intervals)
        output = []
        
        #when the start of the new interval is greater than the curr index
        while(curr_idx < total_intervals and intervals[curr_idx][1] < newInterval[0]):
            output.append(intervals[curr_idx])
            curr_idx += 1
        
        #when the start of the curr idx is less than the end of the new interval's end that means a merging index came up
        while(curr_idx < total_intervals and intervals[curr_idx][0] <= newInterval[1]):
            newInterval[0] = min(newInterval[0], intervals[curr_idx][0])
            newInterval[1] = max(intervals[curr_idx][1], newInterval[1])
            curr_idx += 1
        output.append(newInterval)
       
       # append the rest of the indexes after the merging
        while curr_idx < total_intervals:
            output.append(intervals[curr_idx])
            curr_idx += 1
            
        return output


        


        
