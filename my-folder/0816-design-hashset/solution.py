class MyHashSet:

    def __init__(self):
        self.n = 1000
        self.arr =[[] for _ in range(self.n)] 

    def add(self, key: int) -> None:
        if not self.contains(key):
            self.arr[key%self.n].append(key)

    def remove(self, key: int) -> None:
        if self.contains(key):
            self.arr[key%self.n].remove(key)
        

    def contains(self, key: int) -> bool:
        return key in self.arr[key%self.n]
