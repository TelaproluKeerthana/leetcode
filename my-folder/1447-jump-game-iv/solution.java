class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;

        if (n == 1) return 0;

        Map<Integer, List<Integer>> nodeToIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nodeToIndex
                .computeIfAbsent(arr[i], k -> new ArrayList<>())
                .add(i);
        }

        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[n];

        que.offer(0);
        visited[0] = true;

        int steps = 0;

        while (!que.isEmpty()) {
            int size = que.size();

            for (int i = 0; i < size; i++) {
                int curr = que.poll();

                if (curr == n - 1) return steps;

                List<Integer> sameValueIndexes = nodeToIndex.get(arr[curr]);

                for (int next : sameValueIndexes) {
                    if (!visited[next]) {
                        visited[next] = true;
                        que.offer(next);
                    }
                }

                if (curr - 1 >= 0 && !visited[curr - 1]) {
                    visited[curr - 1] = true;
                    que.offer(curr - 1);
                }

                if (curr + 1 < n && !visited[curr + 1]) {
                    visited[curr + 1] = true;
                    que.offer(curr + 1);
                }

                sameValueIndexes.clear();
            }

            steps++;
        }

        return -1;
    }
}

// NI = {100 : [0, 5], -23 : [1, 2], 404 : [3], 23 : [6, 7, 8], 3 : [9]}
// AL = {0: {1, 5}, 1: {0, 2}, 2 : {1, 3, 1}, 3 : {2, 4, }, 4 : {3, 5}, 5 : {4, 6, 0}, 6 : {5, 7, }, 7 : {6, 8}, 8 : {7, 9, 6}, 9:{8, 10}, 10:{9,3}}

// do bfs on AL  and 
// when you adding a index value to existing node add all those existing node values in al

