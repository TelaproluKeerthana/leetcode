public class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int[][] dist = new int[rows][cols];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        minHeap.offer(new int[]{0, 0, 0}); // {diff, row, col}

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int diff = curr[0], r = curr[1], c = curr[2];

            if (r == rows - 1 && c == cols - 1) return diff;
            if (dist[r][c] < diff) continue;

            for (int[] dir : directions) {
                int newR = r + dir[0], newC = c + dir[1];
                if (newR < 0 || newC < 0 || newR >= rows || newC >= cols) {
                    continue;
                }

                int newDiff = Math.max(diff, Math.abs(heights[r][c] - heights[newR][newC]));
                if (newDiff < dist[newR][newC]) {
                    dist[newR][newC] = newDiff;
                    minHeap.offer(new int[]{newDiff, newR, newC});
                }
            }
        }

        return 0;
    }
}

// heights = [[1,2,2],[3,8,2],[5,3,5]]

// minBestEffort
// [0 1 1]
// [2 5 1]
// [2 2 2]

// build pq based on the 
// pq = [[dist, row, col]] 0 0 0(pop); 1 0 1(pop); 2 1 0; 6 1 1; 0 0 2; 
// 002(pop); 210; 611; 012;
// 012(pop); 210; 611; 322
// 210(pop); 322; 611; 511; 220
// 220; 322; 511; 611; 221
// 221; 322; 511; 611; 222
// 222(return 2)

// here we are updating the minimum effort when we encounter a way to reach that cell with less effort and from there we are trying to see if we can reach to the n-1,n-1 cell and when we reach it we are return the value when we reach it.
