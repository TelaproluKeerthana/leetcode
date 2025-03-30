class LRUCache:

    def __init__(self, capacity: int):
        self.pairs = {}
        self.capacity = capacity
        self.lru_keys = []

    def get(self, key: int) -> int:
        if key not in self.pairs:
            return -1
        else:
            self.lru_keys.remove(key)
            self.lru_keys.append(key)
            return self.pairs[key]
        
    def put(self, key: int, value: int) -> None:
        # if len(self.queue) == self.capacity:
        #     k, v = self.queue.popleft()
        #     del self.pairs[k]
        if key in self.pairs:
            self.lru_keys.remove(key)
            self.lru_keys.append(key)
            self.pairs[key] = value
            return None
        
        elif len(self.lru_keys) == self.capacity:
            k = self.lru_keys.pop(0)
            del self.pairs[k]
            self.pairs[key] = value

        else:
            self.pairs[key] = value
        
        self.lru_keys.append(key)
        return None


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)
