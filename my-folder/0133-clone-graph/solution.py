"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        nodes={}
                
        def dfs(node):
            if node in nodes:
                return nodes[node]
    
            neighnode=Node(node.val)
            nodes[node]=neighnode
            for i in node.neighbors:
                neighnode.neighbors.append(dfs(i))
            return neighnode

        return dfs(node) if node else None

            
            
# nodes={1:[2,4],2:[1,3],3:[2,4],4:[1,4]}
# dfs(1)
# neighnode=Node(1)
# nodes[1]=neighnode  
# 1: 2,4
#      i
# neighnode.neighbors.append(dfs(i))
# if 2 in nodes x
# neighnode=Node(2)
# nodes[2]=neighnode
# 2: 1:3
#      i
#    dfs(1) return nodes[1]
#    dfs(3) 
#    neighnode=Node(3)
#    nodes[3]=neighnode
#    3: 2,4
#         i 
#         dfs(2) return nodes[2]
    # dfs(4) 
    # neighnode=Node(4)
    # nodes[4]=neighnode
    # 4: 1 3
    #      i dfs(1) return 1
    #      i=3 3 in nodes returns and appends to 4
    







        

        
