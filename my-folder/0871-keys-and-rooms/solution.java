class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // build a adjacency list 
        // Map<Integer, List<Integer>> adjList = new HashMap<>();
        // for(int i = 0; i < rooms.size(); i++){
        //     adjList.put(i, rooms.get(i));
        // // }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> que = new ArrayDeque<>();
        que.offer(0);
        visited.add(0);
        while(!que.isEmpty()){
            int curr = que.poll();
            List<Integer> currRoomNeighbors = rooms.get(curr);
            for(int i = 0; i < currRoomNeighbors.size(); i++){
                int neighbor = currRoomNeighbors.get(i);
                if(!visited.contains(neighbor)){
                    que.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return visited.size() == rooms.size();


    }
}

// {"0" : 1,
// "1" : 2,
// "2" : 3,
// "3" : ""
// }
