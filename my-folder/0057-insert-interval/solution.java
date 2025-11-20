class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> resultIntervals = new ArrayList<>();
        int currIdx = 0;
        // when you dont see an overlap
        while(currIdx < intervals.length && intervals[currIdx][1] < newInterval[0]){
            resultIntervals.add(intervals[currIdx]);
            currIdx++;
        }

        // when you do see an overlap
        while(currIdx < intervals.length && intervals[currIdx][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[currIdx][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[currIdx][1], newInterval[1]);
            currIdx++;
        }
        resultIntervals.add(newInterval);

        // adding the rest of the intervals
        while(currIdx < intervals.length){
            resultIntervals.add(intervals[currIdx]);
            currIdx++;
        }

        int totalLen = resultIntervals.size();
        int[][] res = new int[totalLen][2];

        for(int i = 0; i < totalLen; i++){
            res[i] = resultIntervals.get(i);
        }

        return res;        
        }
    }
// [[1,3],[6,9]] [2, 6]
// -> [1, 5] [6, 9]

// [[1,2],[3,5],[6,7],[8,10],[12,16]]
// start = 3
// end = max(10, 8)
//                      i
//  [4 8]
//  intervals = [[1, 2], [3, 10], [12, 16]]
