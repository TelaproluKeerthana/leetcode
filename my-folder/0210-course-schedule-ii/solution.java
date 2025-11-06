class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int c = 0; c < numCourses; c++){
            adjList.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            indegree[pre[0]]++;
            adjList.get(pre[1]).add(pre[0]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        for(int c = 0; c < numCourses; c++){
            if(indegree[c] == 0){
                que.offer(c);
            }
        }

        while(!que.isEmpty()){
            int curr = que.poll();
            res.add(curr);
            for(int c : adjList.get(curr)){
                indegree[c]--;
                if(indegree[c] == 0){
                    que.offer(c);
                }
            }
        }

        if(res.size() != numCourses){
            return new int[0];
        }

        int[] order = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            order[i] = res.get(i);
        }

        return order;
    }
}

// numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
// 1 : 0
// 2 : 0
// 3 : [1,2]

