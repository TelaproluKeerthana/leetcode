class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        for(int[] curr : intervals){
            if(result.size() != 0){
                int[] last = result.get(result.size() - 1);
                if(last[1] >= curr[0]){
                    result.remove(result.size() - 1);
                    result.add(new int[]{Math.min(last[0], curr[0]), Math.max(last[1], curr[1])});             
                }
                else{
                    result.add(curr);
                }
            }
            else{
                result.add(curr);
            }
        }

        int[][] res = new int[result.size()][2];
        for(int i = 0; i < res.length; i++){
            res[i] = result.get(i);
        }

        return res;
    }
}

// [[1,3],[2,6],[8,10],[15,18]]
//                       i
// res = [1,6][8,10][15, 18] -> return it
// [1, 3] - [2, 6]
// min(start1, start2), max(end1, end2) and store in result
