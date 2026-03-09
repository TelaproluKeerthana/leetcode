class ListNode{
    int val;
    int key;
    ListNode prev = null;
    ListNode next = null;
    public ListNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int maxCapacity = 0;
    Map<Integer, ListNode> lru;
    ListNode left;
    ListNode right;
    int currCap = 0;
    public LRUCache(int capacity) {
        left = new ListNode(0, 0);
        right = new ListNode(0, 0);
        left.prev = null;
        left.next = right;
        right.prev = left;
        right.next= null;
        lru = new HashMap<>();
        maxCapacity = capacity;
    }
    
    public int get(int key) {
        if(!lru.containsKey(key)){
            return -1;
        }

        ListNode curr = lru.get(key);
        deleteNode(curr);
        insertNode(curr);
        return curr.val;
    }
    
    public void put(int key, int value) {
        if(lru.containsKey(key)){
            ListNode curr = lru.get(key);
            deleteNode(curr);
        }
    
            ListNode newNode = new ListNode(key, value);
            lru.put(key, newNode);
            insertNode(newNode);

           
            if(maxCapacity < lru.size()){
                ListNode now = left.next;
                deleteNode(now);
                lru.remove(now.key);
            }
    }

    public void insertNode(ListNode node){
        ListNode curr = right.prev;
        curr.next = node;
        node.prev = curr;
        node.next = right;
        right.prev = node;
    }

    public void deleteNode(ListNode node){
        ListNode front = node.prev;
        ListNode back = node.next;
        front.next = back;
        back.prev = front;
    }
}

// first
// 1 : 1, 3 : 3, 4 : 4  -> if size exceeds then pop the first element


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
