class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            adjList.add(new ArrayList<Integer>());
        }   

        for(int[] prereq : prerequisites){
            int crs = prereq[0];
            int pre = prereq[1];
            indegree[crs]++;
            adjList.get(pre).add(crs);
        }

        int finish = 0;
        Queue<Integer> completed = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                completed.offer(i);
            }
        }

        while(!completed.isEmpty()){
            int curr = completed.poll();
            finish++;
            for(int nei : adjList.get(curr)){
                indegree[nei]--;
                if(indegree[nei] == 0){
                    completed.offer(nei);
                }
            }
        }

        return finish == numCourses;
    }
}




