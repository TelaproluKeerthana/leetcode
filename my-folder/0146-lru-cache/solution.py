from collections import OrderedDict
class LRUCache:

    def __init__(self, capacity: int):
        self.pairs = OrderedDict()
        self.capacity = capacity
        # this is to keep track of the ordering of the keys

    def get(self, key: int) -> int:
        if key not in self.pairs:
            return -1
        else:
            # when there is the key then we remove the key from the ordering and keep it in the end of the order to make it frequent
            self.pairs.move_to_end(key)
            return self.pairs[key]
        
    def put(self, key: int, value: int) -> None:
        if key in self.pairs:
            self.pairs.move_to_end(key)
        
        self.pairs[key] = value

        if len(self.pairs) > self.capacity:
            self.pairs.popitem(last = False)


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)
