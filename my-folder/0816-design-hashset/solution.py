class MyHashSet:

    def __init__(self):

        self.hm=[] 

    def add(self, key: int) -> None:
        total=len(self.hm)
        
        if total==0:
            self.hm.append(key)
        if not self.contains(key):
            self.hm.append(key)

    def remove(self, key: int) -> None:
            i=0
            while i<len(self.hm):
                if(self.hm[i]==key):
                    self.hm.remove(key)
                i+=1

    def contains(self, key: int) -> bool:
        for i in range(len(self.hm)):
            if(self.hm[i]==key):
                return True
        return False
        


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)
