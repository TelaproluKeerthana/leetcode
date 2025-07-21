class ListNode{
    int val;
    ListNode prev, next;

    public ListNode(int val, ListNode prev, ListNode next){
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

class MyCircularQueue {
    private int cap;
    private ListNode left, right;
    public MyCircularQueue(int k) {
        cap = k;
        left = new ListNode(0, null, null);
        right = new ListNode(0, left, null);
        left.next = right;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        ListNode curr = new ListNode(value, right.prev, right);
        right.prev.next = curr;
        right.prev = curr;
        cap--;
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        left.next = left.next.next;
        left.next.prev = left;
        cap++;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : left.next.val;
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        } 
        
        return isEmpty() ? -1 : right.prev.val;
    }
    
    public boolean isEmpty() {
       return left.next == right;
    }
    
    public boolean isFull() {
        return cap == 0;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
