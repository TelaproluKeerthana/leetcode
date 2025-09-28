class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = events.length;
        int day = 0, idx = 0;
        int attended = 0;
        while(idx < n || !minHeap.isEmpty()){
            if(minHeap.isEmpty()){
                day = events[idx][0];
            }
          
           //adding all the events that start 
            while(idx < n && events[idx][0] == day){
                minHeap.offer(events[idx][1]);
                idx++;
            }

            //remove events expired before the day
            while(!minHeap.isEmpty() && day > minHeap.peek()){
                minHeap.poll();
            }

            if(!minHeap.isEmpty()){
                minHeap.poll();
                attended++;
                day++;
            }
        }

        return attended;
    }
}
