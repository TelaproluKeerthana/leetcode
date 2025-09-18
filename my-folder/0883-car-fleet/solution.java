import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        // Pair position with speed
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Sort by position descending (closer to target first)
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> fleets = new Stack<>();
        for (int i = 0; i < n; i++) {
            double time = (double) (target - cars[i][0]) / cars[i][1];

            // if current car takes longer, it forms a new fleet
            if (fleets.isEmpty() || time > fleets.peek()) {
                fleets.push(time);
            }
            // else: it merges into the fleet ahead (do nothing)
        }

        return fleets.size();
    }
}

