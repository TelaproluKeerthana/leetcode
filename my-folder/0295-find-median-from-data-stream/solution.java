class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    boolean evenFlag = true;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>();
        minHeap = new PriorityQueue<>((a, b) -> b - a);
    }
    
    public void addNum(int num) {
        if(evenFlag){
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        else{
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        evenFlag = !evenFlag;
    }
    
    public double findMedian() {
        if(maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        }
        
        return (double)(maxHeap.peek() + minHeap.peek()) / 2;       
    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
