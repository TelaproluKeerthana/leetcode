class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];


        Queue<Integer> que = new LinkedList<>();
        que.offer(start);


        while(!que.isEmpty()){
            int curr = que.poll();
            if(visited[curr] == true) continue;
            if(arr[curr] == 0) return true;
            visited[curr] = true;
                int left = curr - arr[curr];
                int right = curr + arr[curr];
                if(left >= 0){
                    que.offer(left);
                }

                if(right < arr.length){
                    que.offer(right);
                }
        }

        return false;
    }
}

// maybe keep a visit set 

// [4,2,3,0,3,1,2] start = 5

// start at 1 from 5 + 1 = 2, 
//          1 (4 - 3  = 1) from (1 + 2 == 0 return true)

