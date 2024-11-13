class Node:
    def __init__(self,key):
        self.key=key
        self.next=None


class MyHashSet:

    def __init__(self):
        self.hm=[Node(0)] *10000
    #creation of dummy node

    def add(self, key: int) -> None:
        curr=self.hm[key%len(self.hm)]
        while(curr.next):
            if curr.next.key==key:
                return
            curr=curr.next
        curr.next=Node(key)

    def remove(self, key: int) -> None:
            curr=self.hm[key%len(self.hm)]
            while(curr.next):
                if curr.next.key==key:
                    curr.next=curr.next.next
                    return
                curr=curr.next
    
    def contains(self, key: int) -> bool:
        curr=self.hm[key%len(self.hm)]
        while(curr.next):
            if curr.next.key==key:
                return True
            curr=curr.next
        return False
        


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)
