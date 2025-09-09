import java.util.*;

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Sort trips by start location
        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));

        // Min-heap to track when passengers leave (by end location)
        PriorityQueue<int[]> ongoing = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));

        int passengers = 0;

        for (int[] trip : trips) {
            int num = trip[0], start = trip[1], end = trip[2];

            // Remove passengers who already left
            while (!ongoing.isEmpty() && ongoing.peek()[2] <= start) {
                passengers -= ongoing.poll()[0];
            }

            // Add current trip
            passengers += num;
            if (passengers > capacity) return false;

            ongoing.offer(trip);
        }
        return true;
    }
}

