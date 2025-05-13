
class MyHashMap {
    private ArrayList<int[]> hashMap;
    public MyHashMap() {
        hashMap = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for(int[] pair : hashMap){
            if(pair[0] == key){
                pair[1] = value;
                return;
            }
        }
        hashMap.add(new int[]{key, value});
    }
    
    public int get(int key) {
        for(int[] pair : hashMap){
            if(pair[0] == key){
                return pair[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0; i < hashMap.size(); i++){
            if(hashMap.get(i)[0] == key){
                hashMap.remove(i);
            }
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
