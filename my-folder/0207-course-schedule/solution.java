class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // topological sort 
        List<List<Integer>> adjList = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int c = 0; c < numCourses; c++){
            adjList.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            adjList.get(pre[0]).add(pre[1]);
            indegree[pre[1]]++;
        }

        Queue<Integer> que = new LinkedList<>();
        int finish = 0;
        for(int c = 0; c < numCourses; c++){
            if(indegree[c] == 0){
                que.offer(c);
            }
        }

        while(!que.isEmpty()){
            int curr = que.poll();
            finish++;
            for(int nei : adjList.get(curr)){
                indegree[nei]--;
                if(indegree[nei] == 0){
                    que.offer(nei);
                }
            }
        }

    return finish == numCourses;
    }
}
