class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Double, List<int[]>> distancePoint = new HashMap<>();
        PriorityQueue<Double> distance = new PriorityQueue<>();
        int[][] result = new int[k][2];

        for(int i = 0; i < points.length; i++){
            int dx = points[i][0];
            int dy = points[i][1];
            double ed = Math.sqrt(dx * dx + dy * dy);
            
            distance.add(ed);
            
            distancePoint.putIfAbsent(ed, new ArrayList<>());
            distancePoint.get(ed).add(new int[]{dx, dy});
        }
       
       int idx = 0;
       while(k > 0 && !distance.isEmpty()){
            double curr = distance.poll();
            List<int[]> pts = distancePoint.get(curr);
            while(k > 0 && !pts.isEmpty()){
                int[] p = pts.remove(0);
                 result[idx][0] = p[0];
                 result[idx][1] = p[1];
                 idx++;
                 k--;
            }
        }

        return result;
    }
}
