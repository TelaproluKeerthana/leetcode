class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];

            adjList.get(prereq).add(course); 
            indegree[course]++;
        }

        Queue<Integer> que = new LinkedList<>();
        for (int c = 0; c < numCourses; c++) {
            if (indegree[c] == 0) {
                que.offer(c);
            }
        }

        int count = 0;
        while (!que.isEmpty()) {
            int curr = que.poll();
            count++;

            for (int next : adjList.get(curr)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    que.offer(next);
                }
            }
        }

        return count == numCourses;
    }
}
