class Solution {

    // cycle detection approach
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        HashSet<Integer> visiting = new HashSet<>();

        for(int c = 0; c < numCourses; c++){
         adjList.put(c, new ArrayList<>());   
        }

        for(int[] pre : prerequisites){
            adjList.get(pre[0]).add(pre[1]);
        }


        for(int c = 0; c < numCourses; c++){
            if(!dfs(c, adjList, visiting)){
                return false;
            }
        }

       return true; 
    }

    public boolean dfs(int course, Map<Integer, List<Integer>> adjList, HashSet<Integer> visiting){
        if(visiting.contains(course)) return false;

        if(adjList.get(course).isEmpty()) return true;

        visiting.add(course);
        for(int crs : adjList.get(course)){
            if(!dfs(crs, adjList, visiting)){
                return false;
            }
        }
        visiting.remove(course);
        adjList.put(course, new ArrayList<>());

        return true;
    }
}
