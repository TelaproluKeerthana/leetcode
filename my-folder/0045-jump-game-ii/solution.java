class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;         
        int goal = n - 1;
        Queue<Integer> que = new LinkedList<>();
        que.offer(0);
        int steps = 0;
        boolean[] visited = new boolean[goal + 1];
        visited[0] = true;
        while(!que.isEmpty()){
            int size = que.size();
            steps++;
            while (size-- > 0) {
                int curr = que.poll();
                int maxReach = curr + nums[curr];

                if (maxReach >= goal) return steps;

                for (int next = curr + 1; next <= maxReach; next++) {
                    if (!visited[next]) {
                        visited[next] = true;
                        que.offer(next);
                    }
                }
            }
        }

        return 0;
    }
}

// [2,3,1,1,4]
    // max(3 + 1, 1 + 2)

