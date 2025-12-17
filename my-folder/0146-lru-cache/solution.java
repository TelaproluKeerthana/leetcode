class ListNode{
    int value;
    int key;
    ListNode prev;
    ListNode next;
    public ListNode( int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    ListNode left;
    ListNode right; 
    int size;

    Map<Integer, ListNode> lru;

    public LRUCache(int capacity) {
        left = new ListNode(0, 0);
        right = new ListNode(0, 0);
        left.prev = null;
        left.next = right;
        right.prev = left;
        right.next= null;
        size = capacity;
        lru = new HashMap<>();
    }
    
    public int get(int key) {
        if(lru.containsKey(key)){
            ListNode curr = lru.get(key);
            delete(curr);
            insert(curr);
            return curr.value;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(lru.containsKey(key)){
           ListNode node = lru.get(key);
           delete(node);
        }

        ListNode newNode = new ListNode(key, value);
        lru.put(key, newNode);
        insert(newNode);

        if(size < lru.size()){
            ListNode curr = left.next;
            delete(curr);
            lru.remove(curr.key);
        }
    }
    
    // break the link and insert before the lastNode
    public void insert(ListNode node){
        ListNode prev = right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = right;
        right.prev = node;
    }


    public void delete(ListNode node){
        ListNode prev = node.prev;
        ListNode newnext = node.next;
        prev.next = newnext;
        newnext.prev = prev;       
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
