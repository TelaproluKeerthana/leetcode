class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int[] times = new int[tickets.length];
        Queue<int[]> buyTickets = new LinkedList<>();
        int currTime = 0;
        int idx = 0;
        for(int ticket : tickets){
            buyTickets.offer(new int[]{ticket, idx++});
        }
        int time = 0;
        while(!buyTickets.isEmpty()){
            int[] top = buyTickets.poll();
            top[0]--;
            time++;
            if(top[0] == 0){
                if(top[1] == k){
                    return time;
                }
            }
            else{
                
                buyTickets.offer(top);
            }
        }

        return time;
    }
}

// int[] = [noofTicketsLeftToBuy, Idx, timeSpent]

