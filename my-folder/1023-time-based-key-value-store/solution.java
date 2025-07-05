class TimeMap {

    Map<String, List<String[]>> store;
    public TimeMap() {
    store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, k -> new ArrayList<>()).add(new String[]{String.valueOf(timestamp), value});
    }
    
    public String get(String key, int timestamp) {
     if(!store.containsKey(key)){
        return "";
     }
     
     List<String[]> list = store.get(key); 
     int left = 0;
     int right = list.size() - 1;
     int res = -1;
     while(left <= right){
        int mid = left + (right - left) / 2;
        int currMid = Integer.parseInt(list.get(mid)[0]);
        if(currMid <= timestamp){
            res = mid;
            left = mid + 1;
        }
        else{
            right = mid - 1;
        }
     }

     return res == -1 ? "" : list.get(res)[1];
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
