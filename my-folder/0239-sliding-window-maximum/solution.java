class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];
        Deque<Integer> q = new LinkedList<>();
        int l = 0, r = 0;
        
        // you're building a monotonically decreasing queue of indices, such that you have the smallest at end and max at beginning 
        while(r < n){
            // when current element is greater than the last element. remove all elements until the statement is false
            while(!q.isEmpty() && nums[q.getLast()] < nums[r]){
                q.removeLast();
            }
            // then keep the current indices at the right position
            q.addLast(r);

            //when the current max is not within curr window range, remove it
            if(l > q.getFirst()){
                q.removeFirst();
            }

            //when curr r is greater than the window size, pick the current max for that window
            if((r + 1) >= k){
                output[l] = nums[q.getFirst()];
                l++;
            }

            r++;
        }

        return output;
    }
}
