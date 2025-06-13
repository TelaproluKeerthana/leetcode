class MyQueue {

    List<Integer> stack1; 
    List<Integer> stack2;
    int front;

    public MyQueue() {
        stack1 = new ArrayList<>();
        stack2 = new ArrayList<>(); 
        front = 0;
    }
    
    public void push(int x) {
        stack1.add(x);
    }
    
    public int pop() {
        while(stack1.size() > 1){
            stack2.add(stack1.get(stack1.size() - 1));
            stack1.remove(stack1.size() - 1);
        }

        int popped_element = stack1.get(0);
        stack1.remove(0);
        while(stack2.size() > 0){
            stack1.add(stack2.get(stack2.size() - 1));
            stack2.remove(stack2.size() - 1);
        }
    
        return popped_element;
    }
    
    public int peek() {
        while(stack1.size() > 1){
            stack2.add(stack1.get(stack1.size() - 1));
            stack1.remove(stack1.size() - 1);
        }

        int popped_element = stack1.get(0);
        while(stack2.size() > 0){
            stack1.add(stack2.get(stack2.size() - 1));
            stack2.remove(stack2.size() - 1);
        }
    
        return popped_element;
        
    }
    
    public boolean empty() {
        if(stack1.isEmpty()){
            return true;
        }

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
