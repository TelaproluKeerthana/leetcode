class MyHashMap:
    def __init__(self):
        self.maxi = 1000  # Size of the hash map
        self.hm = [[] for _ in range(self.maxi)]  # Array of empty lists for chaining
    
    def put(self, key: int, value: int) -> None:
        index = key % self.maxi  # Compute index based on key modulo map size
        for i, kv in enumerate(self.hm[index]):  # Iterate through the linked list at this index
            if kv[0] == key:  # If the key exists, update its value
                self.hm[index][i] = (key, value)
                return
        self.hm[index].append((key, value))  # If key doesn't exist, add the key-value pair
    
    def get(self, key: int) -> int:
        index = key % self.maxi  # Compute index
        for kv in self.hm[index]:  # Search the linked list at this index
            if kv[0] == key:  # If key found, return its value
                return kv[1]
        return -1  # If key not found, return -1
    
    def remove(self, key: int) -> None:
        index = key % self.maxi  # Compute index
        for i, kv in enumerate(self.hm[index]):  # Search the linked list at this index
            if kv[0] == key:  # If key found, remove it
                del self.hm[index][i]
                return


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)
