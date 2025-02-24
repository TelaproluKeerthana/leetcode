# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isCousins(self, root: Optional[TreeNode], x: int, y: int) -> bool:
        tracker={}
        def dfs(node,parent,depth):
            if not node:
                return 
            # depth=1
            # if node.val==x or node.val==y:
            #     return depth
            dfs(node.left,node,depth+1)
            dfs(node.right,node,depth+1)
            if node.val in (x,y):
                tracker[node.val]=(parent,depth)
        dfs(root,None,0)
        cousins=tracker.get(x) and tracker.get(y) and tracker[x][1]==tracker[y][1] and tracker[x][0]!=tracker[y][0]
        return cousins


        
