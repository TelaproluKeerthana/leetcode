class Solution {
    public int minimumCost(int[] cost) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int c : cost){
            pq.offer(c);
        }

        int cst = 0;
        while(!pq.isEmpty()){
            if(pq.size() > 2){
                cst += pq.poll();
                cst += pq.poll();
                pq.poll();
            }
            else{
                cst += pq.poll();
            }
        }

        return cst;
    }
}

// find the minimum cost of finding all candies
// -> use a priority queue for this problem 
// add 1, 2, 3 to pq make it maxheap
// when the pq is not empty then pop 2 elements and add it to sum then pop the 3rd and continue the process until the que is empty and return sum


