class DetectSquares {
    Map<Integer, Map<Integer, Integer>> map;
    public DetectSquares() {
     map = new HashMap<>();   
     
    }
    
    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        map.putIfAbsent(x, new HashMap<>());
        Map<Integer, Integer> ymap = map.get(x);
        ymap.put(y, ymap.getOrDefault(y, 0) + 1);

    }
    
    public int count(int[] point) {
        int x = point[0];
        int y = point[1];

        if(!map.containsKey(x)){
            return 0;
        }

        Map<Integer, Integer> sameX = map.get(x);
        int res = 0;
        for(int y2 : sameX.keySet()){
            if(y2 == y) continue;

            int side = y2 - y;
            int first = sameX.get(y2);

            // checking squares on the right side  and left side of the point
            for(int xs : new int[]{x + side, x - side}){
               if(!map.containsKey(xs)) continue;

               Map<Integer, Integer> nextRow = map.get(xs);
               int second =  nextRow.getOrDefault(y, 0);
               int third = nextRow.getOrDefault(y2, 0);

               res += first * second * third;
            }
           
        }

        return res;
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */
