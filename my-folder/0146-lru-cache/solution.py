class LRUCache:

    def __init__(self, capacity: int):
        self.capacity=capacity
        self.lru = {}
        

    def get(self, key: int) -> int:
        if key not in self.lru:
            return -1
        self.lru[key]=self.lru.pop(key)
        return self.lru[key]
        

    def put(self, key: int, value: int) -> None:
        if key in self.lru:
            self.lru.pop(key)
        self.lru[key]=value

        if len(self.lru)>self.capacity:
            self.lru.pop(next(iter(self.lru)))

        
        


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)
