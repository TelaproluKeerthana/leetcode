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
            // checking squares on the right side of the point
            res += (sameX.get(y2) * map.getOrDefault(x + side, Map.of()).getOrDefault(y, 0) *
                    map.getOrDefault(x + side, Map.of()).getOrDefault(y2, 0));

            // checking square on the left side of the point
            res += sameX.get(y2)
                 * map.getOrDefault(x - side, Map.of()).getOrDefault(y, 0)
                 * map.getOrDefault(x - side, Map.of()).getOrDefault(y2, 0);
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
