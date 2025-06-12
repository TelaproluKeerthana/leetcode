class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int top;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        top = 0;
    }
    
    public void push(int x) {
        queue1.offer(x);
        top = x;
    }
    
    public int pop() {
        while(queue1.size() > 1){
            int curr = queue1.poll();
            queue2.offer(curr);
        }
        
        int poppedElement = queue1.poll();
        while(queue2.size() > 0){
            top = queue2.poll();
            queue1.offer(top);
        }

        return poppedElement;
    }
    
    public int top() {
        return top;
        // while(queue1.size() > 1){
        //     int curr = queue1.poll();
        //     queue2.offer(curr);
        // }

        // queue1.peek();
        // int curr = queue1.poll();
        // queue2.offer(curr);
        // while(queue2.size() > 0){
        //     queue1.offer(queue2.pop())
        // }
    }
    
    public boolean empty() {
        if(queue1.size() > 0){
            return false;
        }
        return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
