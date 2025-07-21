class LRUCache {
    
    int capacity;
    List<Integer> priorityOrder;
    Map<Integer, Integer> hashMap;

    public LRUCache(int capacity){
        this.capacity = capacity;
        priorityOrder = new ArrayList<>();
        hashMap = new HashMap<>();
    }
    
    public int get(int key) {
        if(!hashMap.containsKey(key)){
            return -1;
        }
        priorityOrder.remove((Integer)key);
        priorityOrder.add(key);
        return hashMap.get(key);
    }
    
    public void put(int key, int value) {
        if(hashMap.containsKey(key)){
            hashMap.put(key, value);
            priorityOrder.remove((Integer)key);
            priorityOrder.add(key);
        }
        else{
            if (priorityOrder.size() == capacity) {
                int lru = priorityOrder.remove(0);
                hashMap.remove(lru);
            }
            hashMap.put(key, value);
            priorityOrder.add(key); 

        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
