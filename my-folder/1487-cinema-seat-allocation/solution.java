class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

    
        for(int[] reservedSeat : reservedSeats){
            map.computeIfAbsent(reservedSeat[0], k -> new HashSet<>()).add(reservedSeat[1]);
        }

        int maxWays = n * 2;
        for(Set<Integer> seats : map.values()){
            boolean left = !(seats.contains(2) || seats.contains(3) || seats.contains(4) || seats.contains(5));

            boolean right = !(seats.contains(6) || seats.contains(7) || seats.contains(8) || seats.contains(9));

            boolean middle = !(seats.contains(4) || seats.contains(5) || seats.contains(6) || seats.contains(7));

        int families = 0;
            if(left && right){
                families = 2;
            }
            else if(left || right || middle) families = 1;

            maxWays = maxWays - 2 + families;
            
            }
            return maxWays; 
    }
}


// 3 rows 
// [0 x x   0 0 0 0   x 0 0]
// [0 0 0   0 0 x 0   0 0 0]
// [x 0 0   0 0 0 0   0 0 x]
