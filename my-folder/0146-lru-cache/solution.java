class ListNode{
    int val;
    int key;
    ListNode prev, next;

    public ListNode(int key, int val){
        this.val = val;
        this.key= key;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    int capacity;
    Map<Integer, ListNode> cache;
    private ListNode left;
    private ListNode right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.left = new ListNode(0, 0);
        this.right = new ListNode(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    //remove function removes the node by breaking link and attaching it to the next node 
    private void remove(ListNode node){
        ListNode previous = node.prev;
        ListNode nxt = node.next;
        previous.next = nxt;
        nxt.prev = previous;
    }
    
    //insert function insert a node at the end of the linked list before right
    private void insert(ListNode node){
        ListNode previous = this.right.prev;
        previous.next = node;
        node.prev = previous;
        node.next = this.right;
        this.right.prev = node;
    }
    public int get(int key) {
        //if key exists remove the node and insert it at the end as its most recent
        if(cache.containsKey(key)){
            ListNode node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
       }

        return -1;
    }
    
    public void put(int key, int value) {
        // if a key exists first you remove the existing value from map 
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        // insert the newly entered key-val pair 
        ListNode node = new ListNode(key, value);
        cache.put(key, node);
        insert(node);
        
        //if the size exceeds capacity remove it from the cache and delete the key of the key, remove just breaks the link
        if(cache.size() > capacity){
            ListNode lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
