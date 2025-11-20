class Solution {
    public int[][] merge(int[][] intervals) {
        // sort based on the first element 
        List<int[]> resList = new ArrayList<>();
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] prev = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(prev[1] >= intervals[i][0]){
                prev[1] = Math.max(prev[1], intervals[i][1]);
            }
            else{
                resList.add(prev);
                prev = intervals[i];
            }
        }
        resList.add(prev);

        
        return resList.toArray(new int[resList.size()][2]);
    }
}
// res= [[1, 6]]
// [1, 3] [2, 6], [8, 10], [15, 18]
//                          i  
   
// start = min(1, 2)
// end = max(3, 6)
