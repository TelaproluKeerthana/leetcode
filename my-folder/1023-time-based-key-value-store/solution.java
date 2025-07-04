class TimeMap {

    Map<String, TreeMap<Integer, String>> store;
    public TimeMap() {
    store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
     if(!store.containsKey(key)){
        return "";
     }
     
     TreeMap<Integer, String> tree = store.get(key);
     Integer floorKey = tree.floorKey(timestamp);  
     if(floorKey == null){
        return "";
     } 
     return tree.get(floorKey);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
