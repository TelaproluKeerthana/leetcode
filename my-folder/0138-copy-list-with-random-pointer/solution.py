"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def __init__(self):
        self.visited = {}
    
    def get_copy_node(node):
        if node:
            if node in self.visited:
                return self.visited[node]
            else:
                self.visited[node] = Node(node.val, None, None)
                return self.visited[node]
        return None

    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':

        if (head == None):
            return None
        def get_copy_node(node):
            if node:
                if node in self.visited:
                    return self.visited[node]
                else:
                    self.visited[node] = Node(node.val, None, None)
                    return self.visited[node]
            return None

        old_node = head
        new_node = Node(old_node.val, None, None)
        new_head = new_node
        self.visited[old_node] = new_node
        
        while old_node != None:
            if(old_node.random):
                new_node.random = get_copy_node(old_node.random)

     
            if(old_node.next):
                new_node.next = get_copy_node(old_node.next)
                
            
            old_node = old_node.next
            new_node = new_node.next
        
        return new_head
        # node = Node(head.val , None, None)

        # self.visited[head] = node

        
        # node.next = self.copyRandomList(head.next)
        # node.random = self.copyRandomList(head.random)
        
        # return node        
