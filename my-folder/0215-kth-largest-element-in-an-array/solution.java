class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0){
            return 0;
        }
        PriorityQueue<Integer> elements = new PriorityQueue<>();
        for(int num: nums){
            elements.add(num);
            while(elements.size() > k){
                elements.poll();
            }
        }
        
        return elements.peek();
    }
}

// appproach is to use heaps 
// create a minheap with -values then pop the elements k times and return the kth element
